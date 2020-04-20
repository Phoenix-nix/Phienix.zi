import java.util.Arrays;

public class bubbleSort {

    public static void bubbleSort(int[] array) {

        boolean flg = false;//没有发生交换
        for (int i = 0; i < array.length-1; i++) {//比较的趟数

            flg = false;

            for(int j = 0; j< array.length-1-i; j++) {//每趟比较的次数
                if(array[j] > array[j+1]) {//如果当前数字小于下一个数字
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;//交换
                    flg = true;
                }
            }

            if(flg == false) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {1,22,34,5,6};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
