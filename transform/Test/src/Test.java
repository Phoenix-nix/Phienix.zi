import java.util.Arrays;

public class Test {

    public static int[] transform(int[] a){
        int left=0;
        int right=a.length-1;
        while(left<right){
            //该循环结束，left指向一个奇数
            while(left<right&&a[left]%2==0){
                left++;
            }
            //该循环结束，right指向一个偶数
            while(left<right&&a[right]%2!=0){
                right--;
            }
            /// 交换两个元素的位置
            int temp=a[left];
            a[left]=a[right];
            a[right]=temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(Arrays.toString(transform(arr)));
    }

}
