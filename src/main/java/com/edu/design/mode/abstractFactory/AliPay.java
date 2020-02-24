package com.edu.design.mode.abstractFactory;

public class AliPay implements IInternalPay {
    @Override
    public void pay(String orderId, Double money) {
        System.out.println("正在使用支付宝支付 订单号:"+orderId+" 金额:"+money);
    }
}
