public class TestDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(toString(arr));
    }
    public static String toString(int[] arr) {
        String ret = "[";
        for (int i = 0; i < arr.length; i++) {
// 借助 String += 进行拼接字符串
            ret += arr[i];
// 除了最后一个元素之外, 其他元素后面都要加上 ", "
            if (i != arr.length - 1) {
                ret += ", ";
            }
        }
        ret += "]";
        return ret;
    }

}
