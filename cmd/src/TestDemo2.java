
    //类和对象
    //面试问题：00P语言的三大特征（oop面向对象编程） Java C++ ...
    //类和对象：抽象的概念

    //什么是类？          --  自定义类型 模板
    //什么是对象？        --  实体  通过一个类就可以产生对个对象
    //



     //访问修饰限定符：
     //1.public:公有的
     //2.private:私有的
     //3.protected：受保护的
     //4.什么都不写： 默认权限-》 包访问权限

    class Person{//类名大驼峰

        //字段 -→ 成员变量(定义在方法外边 类的里面)
        // 实例成员变量：对象里面
        //实例成员没有初始化 默认值为对应的0值，引用类型默认为null，简单类型默认为0
        public String name;//默认权限
        public int age;

        //静态成员变量
        //如何访问静态成员变量？
        public static int size = 10;

        //方法 -→ 行为
        public void eat() {
            int a = 10;
            System.out.println("eat()!");
        }
        public void sleep() {
            System.out.println("sleep()!");
        }
        public void show() {
            System.out.println("我叫："+ name +", 今年"+ age +"岁");
        }
        public static void func1() {
            System.out.println("static::func1()");
        }

    }

  public class TestDemo2 {


      //如何访问方法？
    public static void main(String[] args) {
          Person per = new Person();
          per.show();
          per.name = "李四";
          per.age = 20;
          per.show();
          per.eat();
          per.sleep();
          per.func1();//Person.func1()被修饰的静态方法用类名访问
     }

      //如何访问静态成员变量？
      //静态成员变量不属于对象
      //静态成员变量直接可以通过类名运行 - 类名+.
    public static void main2(String[] args) {

          Person per = new Person();
          System.out.println(per.name);
          System.out.println(Person.size);
      }


      //如何访问对象当中的实例成员变量?
    public static void main1(String[] args) {
        Person per = new Person();
        //如何访问对象当中的实例成员变量?
        //操作符：点号
        System.out.println(per.age);
    }



  }
