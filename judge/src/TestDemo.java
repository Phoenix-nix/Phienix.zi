import java.util.Scanner;
public class TestDemo {
    public static void main(String[] args) {
        //判断2进制1的个数优化版
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        while(n != 0) {
            n = n & (n-1);//n*(n-1)即可求出
            count++;
        }
            System.out.println(count);
    }
}
