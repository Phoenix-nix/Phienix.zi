public class WhoFirst {
    static class PrintA extends Thread {
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("A");
            }
        }
    }

    static class PrintB extends Thread {
        public void run() {
            for (int i = 0; i <10 ; i++) {
                System.out.println("B");
            }
        }
    }

    public static void main(String[] args) {
        PrintA a = new PrintA();
        PrintB b = new PrintB();
        a.start();
        b.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main");
        }
    }
//主线程创建两个线程+打印10次main需要的时间，远远小于时间片
//所以可以认为在时间片耗尽之前，主线程可以把所有事情干完
//只有main执行结束放弃CPU，A和B才有资格抢CPU
//数据越来越大，越容易乱码
}
