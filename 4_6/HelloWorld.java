
/*
如果一个类public的，那么这个类名 一定要和文件名相同，并且
一个java文件当中，只能有一个共有的类
*/

public class HelloWorld {

	public static void main(String[] args) {

		System.out.println("HelloWorld");

		/*
		int 整形 4字节
		 */

		int a=10;
		System.out.println(Integer.MAX_VALUE);//Integer包装类，max最大值
		System.out.println(Integer.MIN_VALUE);//min最小值



		System.out.println(a);//打印且换行
		System.out.print(a);//打印不换行
		System.out.printf("%d\n",a);//打印且换行

	}

}