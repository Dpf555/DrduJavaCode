package com.dpf555.lambda;

public class LambdaTest1 {
    public static void main(String[] args) {

        //使用匿名内部类调用useShowHandler方法
        useShowHandler(new ShowHandler() {
            @Override
            public void show() {
                System.out.println("匿名内部类重写后的show方法");
            }
        });

        //使用lambda调用useShowHandler方法
        useShowHandler(()->
            System.out.println("lambda重写后的show方法")
        );
    }

    public static void useShowHandler(ShowHandler showHandler) {
        showHandler.show();
    }

}

@FunctionalInterface     //函数式接口：有且仅有一个抽象方法
interface ShowHandler {
    void show();
}