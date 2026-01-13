package com.dpf555.collection;

import com.dpf555.pojo.Student;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {
    /*
           Collection常用成员方法
                public boolean add(E e) : 把指定的对象添加到当前集合中
                public void clear() : 清空集合中的所有元素
                public boolean isEmpty() : 判断当前集合是否为空
                public boolean remove(E e) : 把给定的对象在当前集合中删除
                public boolean contains(Object obj) : 判断当前集合中是否包含给定的对象
                public int size() : 返回集合中元素的个数（集合的长度）


                remove方法和contains方法依赖与javabean自己的equals，所以在使用时要重写equals方法
     */

    public static void main(String[] args) {
        //使用多态创建集合对象
        Collection<String> c = new ArrayList<>();

        boolean b1 = c.add("张三");  //add方法会返回一个boolean类型的值，成功添加为true否则为false
        boolean b2 = c.add("张三");  //在ArrayList中，add方法永远返回true
        boolean b3 = c.add("张三");  //这是没有意义的，但collection要考虑到所有子类，对HashSet来说这是有意义的

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        boolean result = c.contains("张三");
        c.remove("c");

        System.out.println(c);

        System.out.println("===========================================");

        //接受对象的集合
        Collection<Student> c1 = new ArrayList<>();

        c1.add(new Student("张三",23));
        c1.add(new Student("李四",24));
        c1.add(new Student("王五",25));

        /*for (int i = start; i < end; i++) {
            if (o.equals(es[i])) {    //contains方法是根据equals方法来判断包含关系的
                return i;
            }
        }*/
        System.out.println(c1.contains(new Student("张三",23)));  //返回false，因为地址不同，需要重写equals方法



    }
}
