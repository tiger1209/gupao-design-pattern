package com.edu.design.mode.simpleFactory;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        PaymentFactory paymentFactory = new PaymentFactory();
        Payment payment = paymentFactory.creatPayment(WeChatPay.class);
        payment.pay("100000120200224",60.5);
    }
}
