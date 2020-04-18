public class TestDemo {


    public static void func1(int n) {
        //123
        if (n > 9) {
            func1(n / 10);
        }
        System.out.println(n % 10);
    }

    public static void main(String[] args) {
        //System.out.println(fac(5));
        func1(123);
    }
}
