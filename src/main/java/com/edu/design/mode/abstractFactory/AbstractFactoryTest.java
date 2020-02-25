package com.edu.design.mode.abstractFactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        ChannelFactory  channel = new ChannelFactory();
        channel.createExternalPayment().pay("12222000",8000.00);

    }
}
