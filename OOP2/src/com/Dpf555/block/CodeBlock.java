package com.Dpf555.block;

public class CodeBlock {
    /*
    * 1.局部代码块
        位置：方法中的一对{}
        作用：限定变量的生命周期，提早释放内存
    * 2.构造代码块
        位置：类中方法外的一对{}
        特点：创建对象的时候被调用执行，无论使用男一个构造方法创建对象，都要执行，并且优先于构造方法执行
        作用：如果发现所有构造方法中，存在相同的代码，就可以考虑将这段相同的代码抽取到构造代码块
    * 3.静态代码块
        位置：类中方法外的一对{} 需要加入static修饰
        特点：随着类的加载而执行，字节码加载时，静态代码块就会执行，因为字节码文件只加载一次
        作用：用于执行一些初始化操作
    * 4.同步代码块

    * */
    public static void main(String[] args) {
        {
            int num = 10;
            System.out.println(num);
        }

        Student stu = new Student();
        Student stu1 = new Student(10);

    }
}


class Student{
    {
        System.out.println("Student类的构造代码块执行了...");
    }

    static {
        System.out.println("Student类的静态代码块");
    }

    public Student() {
        System.out.println("Student类的空参构造函数执行了");
    }

    public Student(int num) {
        System.out.println("Student类的带参构造函数执行了");
    }
}
