class Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("第一次调用方法之前");
        int ret = add(a, b);
        System.out.println("第一次调用方法之后");
        System.out.println("ret = " + ret);
        System.out.println("第二次调用方法之前");
        ret = add(30, 50);
        System.out.println("第二次调用方法之后");
        System.out.println("ret = " + ret);
    }
    public static int add(int x, int y) {
        System.out.println("调用方法中 x = " + x + " y = " + y);
        return x + y;
    }
}

