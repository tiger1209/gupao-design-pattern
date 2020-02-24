package com.edu.design.mode.abstractFactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        ShoppingPayFactory  amazonShoping = new AmazonShoppingPayFactory();
        amazonShoping.createExternalPayment().pay("12222000",8000.00);

        ShoppingPayFactory  jdShopping = new JDShoppingPayFactory();
        jdShopping.createInternalPayment().pay("2323232323",500.5);
    }
}
