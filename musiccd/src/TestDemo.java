import java.util.Scanner;

public class TestDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            int n = in.nextInt();
            int s = in.nextInt();
            int L = in.nextInt();
            int everyCD = 1+(L-s)/(s+1);
//          System.out.println("everyCD:　"+everyCD);
            int num = 0;
            if(everyCD < 13) {
                num = (int)Math.ceil((double)n/everyCD);
            } else if(everyCD == 13) {
                num = (int)Math.ceil((double)n/12);
            } else {
                if(everyCD > n && n % 13 == 0) {
                    num = 2;
                }else {
                    num = (int)Math.ceil((double)n/everyCD);
                    if(n % everyCD == 13 && everyCD == 14) {
                        num++;
                    }
                    if(n % everyCD == 13 && n < everyCD) {
                        num++;
                    }
                }
            }
            System.out.println(num);
        }
    }

}