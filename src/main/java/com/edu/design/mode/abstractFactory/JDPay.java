package com.edu.design.mode.abstractFactory;

public class JDPay implements IInternalPay {
    @Override
    public void pay(String orderId, Double money) {
        System.out.println("正在使用京东支付 订单号:"+orderId+" 金额:"+money);
    }
}
