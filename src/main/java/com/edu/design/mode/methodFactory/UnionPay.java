package com.edu.design.mode.methodFactory;

public class UnionPay extends Payment {
    @Override
    public void pay(String orderId,Double money) {
        System.out.println("正在使用银联支付 "+"订单号："+orderId+ " 金额:"+money);
    }
}
