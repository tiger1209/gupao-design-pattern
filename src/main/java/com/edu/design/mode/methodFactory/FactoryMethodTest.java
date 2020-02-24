package com.edu.design.mode.methodFactory;

public class FactoryMethodTest {
    public static void main(String[] args) {
        Payment payment = new AliPayFactory().createPayment();
        payment.init();
        payment.pay("00000202002241059",100.5);

        Payment payment2 = new UnionPayFactory().createPayment();
        payment2.init();
        payment2.pay("00000202002241159",200.5);
    }
}
