public class factorial{

    public static void main(String[] args) {
	
    	//求5的阶乘和

		int num = 5;
		int i = 1;
		int ret = 1;
		int sum=0;
		while(i <= num) {
			ret *= i;
			sum += ret;
			i++;
			
		}
		
		System.out.println(ret);
		System.out.println(sum);
	}
}