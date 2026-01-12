package com.Dpf555.pojo;

import java.util.Objects;

public class Student {
    private String name;
    private int age;

    public Student() {}

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;    //getClass方法用来比较两个对象的字节码，如果字节码不同，代表类型不一致
        Student student = (Student) o;   //向下转型，调用子类特有的属性
        return age == student.age && Objects.equals(name, student.name);
    }
}
