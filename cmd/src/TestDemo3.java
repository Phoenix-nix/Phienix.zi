

//封装：用private来修饰属性或者方法
class Student {
    //public String name;

    //限定只能在类中进行访问
    private String MyName;
    public int age;

    //键盘的alt+insert可以让编译器生成get set

    /**@Override
    public String toString() {
        return "Student{" +
                "MyName='" + MyName + '\'' +
                ", age=" + age +
                '}';//这样生成之后，直接用下面的命令调用
        System.out.println(student);
    }*/

    //提供一个公开的接口
    public  String getMyName() {
        return MyName;
    }

    public void setMyName(String name) {
        //MyName = MyName;//其实就是自己给自己赋值，并没有赋值属性，局部变量优先
        this.MyName = MyName;
    }

    public void func1() {
        System.out.println("func1()");
    }
    public void show() {
        System.out.println("我叫" + this.MyName + ", 今年" + this.age);
    }
}
//以上是类的实现者写的代码

//以下是类的调用者
public class TestDemo3 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setMyName("xxx");
        //student.name = "xxx";
        System.out.println(student.getMyName());
    }
}
