import java.util.Scanner;
import java.util.Random;

public class HomeWork {

	/**
	 * 猜数字:
	 * @param args [description]
	 */
	
	public static void main(String[] args){
	    Scanner scan = new Scanner(System.in);

	    Random random = new Random();//生成随机数   如果给定一个时间戳，他给出的随机数是不变的
	    int randNum = random.nextInt(100)+100;//  0 - 100    100+200

	    //System.out.println(randNum);//系统随机输出随机数（我们要猜的数字）


	    while(true) {//写一个死循环，直到猜对，退出循环
	    	 System.out.println("请输入你要读的数字：");
	    	 int num = scan.nextInt();
	    	 if  (num < randNum) {
	    	 	 System.out.println("你猜的数字小了！");
	    	 }else if(num == randNum) {
	    	 	 System.out.println("你的数字猜对了！");
	    	     break;
	    	 }else {
	    	 	 System.out.println("你的数字猜大了！");
	    	 }
	    }

    }
}