package com.Dpf555.test;

public class PlatformPaymentlmpl implements Payment{
    @Override
    public void pay(double money) {
        System.out.println("通过支付平台支付了" + money +"元");
    }
}
