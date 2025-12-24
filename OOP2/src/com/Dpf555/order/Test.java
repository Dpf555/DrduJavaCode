package com.Dpf555.order;

import java.util.Scanner;

public class Test {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：1.国内订单    2.国外订单");

        int choice = sc.nextInt();
        OrderService orderService = null;   // 接口也具有多态

        if(choice == 1) {
            orderService = new OrderServiceImpl();
        } else if(choice == 2) {
            orderService = new OverseasServiceImpl();
            OverseasServiceImpl o = (OverseasServiceImpl) orderService;
            o.check();
        }

        orderService.create();
        orderService.findOne();
        orderService.findList();
        orderService.cancel();
        orderService.finish();
        orderService.paid();
    }
}
