package com.Dpf555.object;

import com.Dpf555.pojo.Person;

import java.util.Objects;

public class ObjectsDemo {
    public static void main(String[] args) {
        Person p1 = null;
        Person p2 = new Person("张三",23 );

        p1.equals(p2);   // equals方法只能判断p2是否为空，这里p1为空，程序抛出空指针异常

        //工具类中的equals方法底层依赖于自己重写的equals方法
        System.out.println(Objects.equals(p1,p2));    //Objects的equals方法可以同时帮我们判断p1和p2是否为空
    }
}
