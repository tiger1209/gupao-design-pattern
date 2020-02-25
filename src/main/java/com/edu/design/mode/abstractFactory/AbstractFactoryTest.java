package com.edu.design.mode.abstractFactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        PayFactory  factory = new ChannelFactory();
        factory.createExternalPayment(PayPal.class).pay("12222000",8000.00);
        factory.createInternalPayment(AliPay.class).pay("12222000",8000.00);
    }
}
