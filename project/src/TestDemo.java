import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);//'a'
            String tmp = sb.toString();
            if (!tmp.contains((ch + ""))) { //"a"
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}
