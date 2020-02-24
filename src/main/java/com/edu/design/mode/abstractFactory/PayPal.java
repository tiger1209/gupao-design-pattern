package com.edu.design.mode.abstractFactory;

public class PayPal implements IExternalPay {
    @Override
    public void pay(String orderId, Double money) {
        System.out.println("正在使用PayPal支付 订单号:"+orderId+" 金额:"+money);
    }
}
