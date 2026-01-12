package com.dpf555.inner.anonymity;

public class AnonymityDemo {

    /*

            匿名内部类：本质上是一种特殊的局部内部类

            使用前提：需要存在一个类，或者是接口

                    new 类名() {}  -->  继承这个类
                    new 接口() {}  -->  实现这个接口

            匿名内部类使用场景：常用于方法的参数传递
     */

    public static void main(String[] args) {
        // 匿名内部类对象
        new Fu() {
            @Override
            public void method() {
                System.out.println("匿名内部类重写后的method方法");   // 具有继承关系
            }
        }.method();


        new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类重写后的show方法");
            }
        }.show();

        userInter(new Inter() {
            @Override
            public void show() {
                System.out.println("show....");
            }
        });
    }

    /*
            Inter i = new Inter() {
                @Override
                public void show() {
                    System.out.println("show....");
                }
            };

            Inter i = Inter 接口的实现类对象
     */

    public static void userInter(Inter i) {
        i.show();
    }
}

class Fu {
    public void method() {
        System.out.println("Fu...method...");
    }
}

interface Inter {
    void show();
}
