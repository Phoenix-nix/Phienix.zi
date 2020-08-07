public class PrintThreadFields {

    //只有继承自Thread的类，才能成为一个线程类
    static class SubThread extends Thread {
        public void run() {
            try {
                printFields();
                Thread.sleep(100 * 1000);
            }catch(InterruptedException e) {}
        }
    }

    //一开始就在一个线程中
    public static void main(String[] args) throws InterruptedException {
        //创建了一个子线程，至于子线程干什么事情，从这里看不出来
        //得去看SubThread的run方法
        Thread thread = new SubThread();
        thread.start();

        //打印主线程的属性信息
        printFields();
        Thread.sleep(100 * 1000);
    }

    //那个线程调用该方法，就打印那个线程的属性
    private static void printFields() {
        Thread t = Thread.currentThread();
        long id = t.getId();
        System.out.println("线程的名字:"+ id + ":" + t.getName());
        System.out.println("线程的优先级:"+ id + ":" + t.getPriority());
        System.out.println("线程的状态:"+ id+":" + t.getState());

        System.out.println("线程是否存活："+id + ":" + t.isAlive());
        System.out.println("线程是否是后台线程："+id + ":" + t.isDaemon());
    }
}
