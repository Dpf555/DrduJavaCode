package com.dpf555.inner;

/*

    问题：调用方法时，方法的形参是接口，我们该传入什么?
    回答：需要传入接口的实现类对象


    1.编写实现类，实现接口
    2.重写方法
    3.创建实现类对象，将对象作为参数传入
 */

public class InnerDemo4 {
    public static void main(String[] args) {
        useInter(new InterImpl());
    }

    public static void useInter(Inter i) {   // Inter i = new InterImpl();
        i.show();
    }
}

interface Inter{  //接口不能实例化，并且方法必须是抽象方法,变量都是静态变量
    static int a=10;
    void show();
}

class InterImpl implements Inter{
    @Override
    public void show() {
        System.out.println("实现类重写后的show方法");
    }
}
