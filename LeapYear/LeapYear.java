import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		//输入年份判断是否是闰年
		
		Scanner scan = new Scanner(System.in);//输入

		int year = scan.nextInt();


		if((year%4==0 && year%100!=0 ) || (year % 400==0)) {

			System.out.println("闰年");
		} 

		else {
			System.out.println("不是闰年");
		}

	}

}