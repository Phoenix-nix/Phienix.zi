public class TestDemo {
    public static void main(String[] args) {
        System.out.println(fistUpper("yuisama"));
        System.out.println(fistUpper(""));
        System.out.println(fistUpper("a"));
    }
    public static String fistUpper(String str) {
        if ("".equals(str)||str==null) {
            return str ;
        }
        if (str.length()>1) {
            return str.substring(0, 1).toUpperCase()+str.substring(1) ;
        }
        return str.toUpperCase() ;
    }
}
