package com.edu.design.mode.methodFactory;

public class AliPay extends Payment {
    @Override
    public void pay(String orderId,Double money) {
        System.out.println("正在使用支付宝支付 "+"订单号："+orderId+ " 金额:"+money);
    }
}
