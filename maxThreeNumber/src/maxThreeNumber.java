import java.util.Scanner;
public class maxThreeNumber {
    //比较3个数的大小
    public static int maxNum(int num1,int num2,int num3) {
        return((num1>num2?num1:num2)>num3?(num1>num2?num1:num2):num3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();*/
        int n1=10;
        int n2=20;
        int n3=45;
        int ret = maxNum(n1,n2,n3);
        System.out.println(ret);
    }

}
