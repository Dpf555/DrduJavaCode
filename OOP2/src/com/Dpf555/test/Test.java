package com.Dpf555.test;

import java.util.Scanner;

public class Test {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择支付方式： 1.支付平台 2.银行卡网银");

        int choice = scanner.nextInt();
        Payment payment = null;
        if(choice == 1) {
            payment = new PlatformPaymentlmpl();
        } else {
            payment = new BankcardPayment();
        }

        System.out.println("请输入您的支付金额");
        double money = scanner.nextDouble();
        payment.pay(money);
    }
}
