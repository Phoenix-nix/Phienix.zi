

public class TextDemo {




	public static void main(String[] args) {
		int a=10;
		long b=a;
		System.out.println(b);//隐式类型转换
		//int和boolean是毫不相关的类型，不能相互赋值，相互转换
		int num=10;
		String str1 = num +"";
        String str2 = String.valueOf(num);
        System.out.println(str2);
	}





	/**
	 * 常量：只能被初始化一次
	 * 字面常量：10  "abc"  1.0
	 * @param args [description]
	 */
	public static void main10(String[] args) {
		final int MAXNUM ;//final修饰的常量最好用大写
		MAXNUM = 999;


		System.out.println(MAXNUM);

	}


	public static void main9(String[] args) {
		byte b=10;
		byte c=20;
		
		byte f=(byte)(b+c);
		//小于4个字节的数据类型，运算的时候，会提升成整型
		System.out.println(f);
	}


	/**
	 * 字符串数据类型：
	 * String
	 * @param args [description]
	 */
	public static void main8(String[] args) {
		String str = "hello";
		System.out.println(str);
	}



	/**
	 * 布尔类型：  没有规定
	 * 1.在Java中，布尔类型没有明确大小
	 * 2.在Java中，只有两个取值，true和false
	 * 3.在Java中，没有所谓的 0 是假，非0 是真
	 * 在Java中，
	 * @param args [description]
	 */
	public static void main7(String[] args) {
		boolean flg = true;
		System.out.println(flg);
	}


	/**
	 * 短整型：short     2个字节         -32768 ~ 32767
	 */
	public static void main6(String[] args) {
		short sh =12;
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
	}




	/**
	 * 字节； Byte     1个字节   数值     -128 ~ 127
	 * 每一种数据类型在给它赋值时，不能超过默认范围
	 */
	public static void main5(String[] args) {
		byte b=12;
		byte c=21;
		System.out.println(b+" "+c);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);

		System.out.println(Byte.MAX_VALUE+1);//println默认以整形进行打印的，所以是128

		

	}


		/**
		 * 字符数据类型
		 * char   2个字节    Character
		 * @param args [description]
		 */
		public static void main4(String[] args) {
			char ch ='a';
			System.out.println(ch);

			char ch2 ='高';
			System.out.println(ch2);
		}



	/**
	 * 单精度 float
	 * 1.   double  8个字节
	 * 2.   float   4个字节
	 * 在Java中不允许把double的值，直接赋给float，编译错误
	 * Java是一个强类型语言，C语言是一个弱类型语言
	 * @param args [description]
	 */
	public static void main3(String[] args) {
		float f=12.3f;
		System.out.println(f);
	}
	

	/**
	 * 双精度 浮点型
	 * 讲解长整型   String[] args代表的什么
	 * @param args [description]
	 */
	public static void main2(String[] args) {
		double d=12.5;
		System.out.println(d);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);

		double a=1.0;
		int b=2;
		System.out.println(a/b);

		double num=1.1;
		System.out.println(num * num);
		//结果1.210000000000000000 
	}



/**
 * 讲解长整型
 * 
 * @param args [description]
 */
	public static void main1(String[] args) {
		//String[] args是运行行命令参数！！
		//可以在命令行输入Java TextDemo xxx xx xxxx    不用定义大小，输入多少存多少
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println("kaixin");
		//将main变成其他的东西，就不是主函数了
		/*int  4个字节     
		long   8个字节     -2^63 ~ 2^63位
		double 8个字节
		float  8个字节
		*/

		long a=10L;

		System.out.println("a");
		System.out.println("最大值："+Long.MAX_VALUE);//拼接
		System.out.println("最小值："+Long.MIN_VALUE);

		int b=10;
		int c=20;
		System.out.println(b + c);
		//当两个都是整形是+做加法，不是拼接

		System.out.println( "hhh"+ b + c );
		//任何类型的数据 和 字符串进行拼接  结果就是字符串
		//将b+c用括号括起来，可以做加法
	}
}