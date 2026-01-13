package com.Dpf555.object;

import com.Dpf555.pojo.Student;

public class ObjectMethodDemo {

    /*
    *   == 号：
    *   1.基本数据类型：比较数据值
    *   2.引用数据类型：比较地址值    //字符串也属于引用数据类型
    * */


    public static void main(String[] args) {
        Student stu1 = new Student("张三",23);
        Student stu2 = new Student("张三",23);

        System.out.println(stu1==stu2);   //结果为false，说明没有比较内容（比较两实体的地址）
        System.out.println(stu1.equals(stu2));   //结果还是false,需要重写
    }
}
