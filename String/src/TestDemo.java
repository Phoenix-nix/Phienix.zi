public class TestDemo {
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

}
