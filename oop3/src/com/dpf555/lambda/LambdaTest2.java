package com.dpf555.lambda;

public class LambdaTest2 {

    public static void main(String[] args) {

        //通过匿名内部类调用useStringHandler方法
        useStringHandler(new StringHandler() {
            @Override
            public void printMessage(String msg) {
                System.out.println(msg+"重写的匿名内部类");
            }
        });

        //通过Lambda调用useStringHandler方法
        useStringHandler(msg->
            System.out.println(msg+"重写的Lambda方法")
        );
    }

    public static void useStringHandler(StringHandler stringHandler){
        stringHandler.printMessage("dpf555");
    }
}

@FunctionalInterface
interface StringHandler{
    void printMessage(String msg);
}
