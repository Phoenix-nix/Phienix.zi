class Calculator {//类处不需要（）
    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int add() {
        return this.num1 + this.num2;
    }

    public int sub() {
        return this.num1 - this.num2;
    }

    public int mul() {
        return this.num1 * this.num2;
    }

    public double dev() {
        return this.num1 * 1.0 / this.num2;
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();//new对象时是大写
        calculator.setNum1(10);//调用函数时是小写
        calculator.setNum2(20);//输入值用setNum
        System.out.println("加法:" + calculator.add());
        System.out.println("减法:" + calculator.sub());
        System.out.println("乘法:" + calculator.mul());
        System.out.println("除法:" + calculator.dev());
    }
}
