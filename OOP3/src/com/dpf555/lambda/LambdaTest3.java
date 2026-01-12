package com.dpf555.lambda;

import java.util.Random;

public class LambdaTest3 {
    public static void main(String[] args) {

        //使用匿名内部类实现useRandomNumHandler方法
        useRandomNumHandler(new RandomNumHandler() {
            @Override
            public int getNumber() {
                Random random = new Random();
                int num = random.nextInt(10);
                return num;
            }
        });

        //使用Lambda实现useRandomNumHandler方法
        useRandomNumHandler(()->
            new Random().nextInt(10)
        );

    }

    public static void useRandomNumHandler(RandomNumHandler randomNumHandler){
        int result = randomNumHandler.getNumber();
        System.out.println(result);
    }
}

@FunctionalInterface
interface RandomNumHandler{
    int getNumber();
}
