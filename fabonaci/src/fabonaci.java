public class fabonaci {
    public static int fabonaci(int n) {
        //斐波那契数列
        if(n==1 || n==2) {
            return 1;
        }
        return fabonaci(n-1)+fabonaci(n-2);

    }
    public static void main(String[] args) {
        System.out.println(fabonaci(3));
    }
}
