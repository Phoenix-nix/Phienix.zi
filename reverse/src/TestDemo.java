public class TestDemo {
    public static String reverse(String str,int begin,int end) {
        char[] value = str.toCharArray();
        while(begin < end) {
            char tmp = value[begin];
            value[begin] = value[end];
            value[end] = tmp;
            begin++;
            end--;
        }
        return String.copyValueOf(value);
    }

    public static void main(String[] args) {
        String str = "abcdefg";
        String ret = reverse(str,0,str.length()-1);
        System.out.println(ret);
    }
}
