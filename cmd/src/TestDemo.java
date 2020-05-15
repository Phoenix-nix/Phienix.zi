import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class TestDemo {

    //二维数组

    //面试重点：数组 字符串



    //找出数组中只出现一次的数字
    //位运算符：& | ^
    //^: 两个相同的数组，如果进行异或，相异为1，相同为0
    //0^任何数都是任何数字

    /**public static void main(String[] args) {
        int[] array = {1,2,4,1,4};
        int ret = 0;
        for(int i=0; i<array.length; i++) {
            ret ^= array[i];
        }
        System.out.println(ret);
    }*/





    /**
     * 不规则的数组
     * 注意：C语言 可以指定列 行可以自动推导
     *       Java 行必须指定，列不可以自动推导
     * @param args
     */



    //了解二维数组的内存结构

    /**public static void main3(String[] args) {

        //Arrays zai java.util.Arrays包里

        int[][] array = new int [2][];//Java 行必须指定，列不可以自动推导
        array[0] = new int[3];
        array[1] = new int[2];

        //array[0] = new int[] {1,2,3};
        //array[1] = new int[] {4,5};

        for(int i=0; i<array.length; i++) {//打印
            for(int j=0; j<array[i].length; j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
    }*/






    /**
     * 以下为规则的二维数组打印
     * 规则的二维数组指定行和列
     * @param args
     */


    //通过foreach来进行数组的遍历

    /**public static void main2(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}};
        for (int[] tmp : array) {//先写一个一维数组遍历行，因为是二维数组，一维数组的写法不行，int x : array不可以
            for (int x : tmp) {  //再按照普通的遍历形式遍历列的元素
                System.out.println(x + " ");
            }
            System.out.println();
        }
    }*/




    //二位数组的深度打印（具体值）

        /*System.out.println(Arrays.ToString(array));//打印的是二位数组的地址
         System.out.println(Arrays.deepToString(array));//打印的是二位数组的具体值*/



    //长度计算麻烦时的 二维数组的打印

       /**for(int i=0; i<array.length; i++) {//要读数太慢了，可以写成array.length,二维数组可以看成两个特殊的一维数组

            for(int j=0; j<array[i].length; j++) {//i控制行，array[i].length可看作第i行数组的长度
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(array));*/



    //二维数组的打印

        /**for(int i=0; i<2; i++) {//i控制行
          for(int j=0; j<3; j++) {//j控制列
            System.out.print(array[i][j]+ " ");
          }
        }*/



    //二维数组的定义方式

        /**public static void main1(String[] args) {

        int [][]array = {{1,2,3},{4,5,6}};//java数组定义不允许出现具体数字
        int [][]array2 = new int[][]{{1,2,3},{4,5,6}};
        int [][]array3 = new int[2][3];
    }*/
}
