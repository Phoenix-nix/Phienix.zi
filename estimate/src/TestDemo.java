public class TestDemo {

    public static boolean isNumber(String str) {
        char[] data = str.toCharArray() ;
        for (int i = 0; i < data.length; i++) {
            if (data[i]<'0' || data[i]>'9') {
                return false ;
            }
        }
        return true ;
    }

    public static void main(String[] args) {
        String str = "1a23456" ;
        System.out.println(isNumber(str)? " 字符串由数字所组成！" : "字符串中有非数字成员！");
    }
}

