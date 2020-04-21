

public class HomeWork {


    public static void main(String[] args) {
        int[] array = {1,2,4,1,4};
        int ret = 0;
        for(int i=0; i<array.length; i++) {
            ret ^= array[i];
        }
        System.out.println(ret);
    }

}
