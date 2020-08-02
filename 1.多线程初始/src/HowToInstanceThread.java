public class HowToInstanceThread {
    static class A extends Thread {
        public void run() {
            System.out.println("我是A类");
        }
    }

    static class B implements Runnable {
        public void run() {
            System.out.println("我是B类");
        }
    }

    public static void main(String[] args) {
        Thread thread;
        {
        //1.直接newA类的对象，本身就是一个Thread对象
           A a = new A();
           thread = a;

           thread.start();
        }

        {
        //2.new B类的对象，是一个Runnable，作为任务传递给线程对象
           B b = new B();
           thread = new Thread();
           thread.start();
        }

        {
        //3.new A类的对象，但把该对象，当做Runnable使用
        //因为Thread本来就实现了Runnable
            A a = new A();
            thread = new Thread(a);
            thread.start();
        }

    }
    }
