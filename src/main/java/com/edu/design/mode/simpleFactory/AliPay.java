package com.edu.design.mode.simpleFactory;

public class AliPay implements Payment {

    @Override
    public void pay(String orderId, Double money) {
        System.out.println("正在使用支付宝支付 \n"+"订单号:"+orderId+",支付金额:"+money);
    }
}
