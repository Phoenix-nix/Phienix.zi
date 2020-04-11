import java.util.Scanner;
public class FindNumber {

	public static void main(String[] args) {
		

			//找一个既能被3整除，又能被5整除的数字
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();//输入

		while (num <= 100) {
			if(num % 15 == 0) {
				System.out.println(num);
				break;
				//如果满足条件，将不再执行循环下面
				//continue;
				//结束本趟循环，继续重新开始新一轮循环
			}
			System.out.println("hhhhh");

			num++;

		}
	}

}