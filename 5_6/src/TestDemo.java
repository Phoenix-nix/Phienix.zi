//c语言中没有字符串类型
//Java中有字符串类型，String
//字符串和数组单链表的题非常多

//主要围绕内存和常用方法

//当前还没有降到JVM虚拟机，提一个概念：字符串常量池（运行时常量池）
//字符串常量值：
//              1.在JDK1.7开始，被挪到堆里
//              2.不重复的

//String constant pool
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.util.Arrays;


class Person {
    private  int age;
}

public class TestDemo {

    public static void main(String[] args) {
        //字符串截取
        String str1 = "abcabcabc";
        //代表从这个位置开始进行截取到结束位置
        String ret = str1.substring(1);
        System.out.println(ret);
        ret = str1.substring(1,4);
        System.out.println(ret);
    }

    public static void main15(String[] args) {
        //字符串替换
        String str1 = "abcabcabc";
        String ret = str1.replace('a','p');
        System.out.println(ret);
    }

    public static void main14(String[] args) {
        //字符串比较
        String str1 = "ABCDef";
        String str2 = "abcdef";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));//忽略大小写
        System.out.println(str1.compareTo(str2));
        //str1  > str2  正数
        //str1  < str2  负数
        //str1 == str2   0
        System.out.println("刘".compareTo("杨"));//汉字比较
    }

    public static void main13(String[] args) throws UnsupportedEncodingException {
        byte[] bytes = {97,98,99,100};
        String str = new String(bytes);
        System.out.println(str);
        String str2 = "abcdef";
        byte[] bytes1 = str2.getBytes("gbk");
        System.out.println("---------------");
        System.out.println(Arrays.toString(bytes1));
    }

    public static boolean func(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch<'0'||ch>'9') {
                return false;
            }
        }
        return true;
    }
    public static void main12(String[] args) {
        String str = "12345a6";
        boolean flg = func(str);
        System.out.println(flg);
    }

    public static void main11(String[] args) {
        //将部分字符数组中的部分内容变成字符串
        char[] val = {'a','b','c','d','e'};
        String str = new String(val,1,3);
        System.out.println(str);
        //取得指定索引位置的字符
        String str2 = "hello";
        char ch = str2.charAt(3);
        System.out.println(ch);
        //将字符串变成字符数组返回
        char[] val2 = str2.toCharArray();
        System.out.println(Arrays.toString(val2));
    }

    public static void main10(String[] args) throws NoSuchFieldException {
        //利用反射-->自省的过程  反射
        //1.拿到class类的对象
       /* Class cl = String.class;
        Field field = cl.getDeclaredField("value");
        field.setAccessible(true);
        char[] val = (char[])field.get(str);
        val[0] = 'g';
        System.out.println(str);*/
    }

    public static void main9(String[] args) {
        String str = "Hello";
        str = "h" + str.substring(1);
        System.out.println(str);

    }

    public static void main8(String[] args) {
        String str = "hello";
        str = str + "world";
        str += "!!!";
        System.out.println(str);
        for (int i = 0; i < 10000; i++) {
            //不敢这样拼接字符串，可以使用StringBuffer StringBuilder
            str+=1;
        }
    }

    public static void main7(String[] args) {
        //equals方法
        String str1 = null;
        String str2 = new String("hello");//引用类型存放的是地址，str1 == str2比较的是存放的地址，地址不同

        System.out.println(str1.equals("hello"));
        System.out.println("hello".equals(str1));//尽量使用这种，因为第一种str可能是null
    }

    public static void main6(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");//引用类型存放的是地址，str1 == str2比较的是存放的地址，地址不同
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        String str3 = "hello";
        System.out.println(str1.equals(str3));
    }

    public static void func(String str,char[] array) {
        str = "abcdef";
        array[0] = 'g';
    }
    public static void main5(String[] args) {
        String str1 = "hello";
        char[] val = {'a'};
        System.out.println(str1);
        System.out.println(Arrays.toString(val));
        func(str1,val);
        System.out.println(str1);
        System.out.println(Arrays.toString(val));
    }

    public static void main4(String[] args) {
        String str1 = "hello";
        String str2 = str1;
        System.out.println(str1);
        System.out.println(str2);

        str1 = "abc";
        System.out.println(str1 == str2);//引用的指向发生了改变
        System.out.println(str1);
        System.out.println(str2);
    }

    public static void main3(String[] args) {
        String str1 = "hello";
        String str2 = "hel" + "lo";//字符串常量，编译时已经处理完变成“hello”
        //person由Class定义，是变量是引用变量
        System.out.println(str1 == str2);

        String str3 = new String("hel") + "lo";//new了一块地方存放hel，常量池里有一个lo，两者合在堆里变成hello
        System.out.println(str3 == str1);
    }

    public static void main2(String[] args) {

        String str1 = "hello";
        String str2 = new String("hello");//引用类型存放的是地址，str1 == str2比较的是存放的地址，地址不同
        System.out.println(str1 == str2);//false

        String str3 = "hello";
        System.out.println(str1 == str3);//true
    }

    public static void main1(String[] args) {
        String str = "hello";
        System.out.println(str);
        String str2 = new String("abcdef");
        System.out.println(str2);
        char[] val = { 'a','b','c','d','e','f'};
        String str3 = new String(val);
        System.out.println(str3);
    }
}
