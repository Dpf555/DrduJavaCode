package com.dpf555.inner;

public class InnerDemo2 {
    /*
    *   静态内部类创建对象格式：
    *           外部类名.内部类名 对象名 = new 外部类名.内部对象().
    *
    *
    * */
    public static void main(String[] args) {
        MyOuter.Inner mi = new MyOuter.Inner();
        mi.show();
        MyOuter.Inner.show2();
    }
}

class MyOuter {
    static class Inner {
        public void show() {
            System.out.println("Inner show");
        }

        static void show2() {
            System.out.println("Inner show2");
        }
    }
}
