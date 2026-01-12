package com.Dpf555.pojo;

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
    public boolean equals(Object obj) {
        if(obj instanceof Student){
            Student stu = (Student) obj;   //多态的弊端：不能直接访问子类的私有成员，因此需要转型
            return this.name.equals(stu.getName()) && this.age == stu.getAge();
        } else {
            return false;
        }

    }
}
