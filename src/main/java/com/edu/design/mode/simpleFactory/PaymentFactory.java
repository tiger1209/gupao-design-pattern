package com.edu.design.mode.simpleFactory;

public class PaymentFactory {
    public Payment creatPayment(Class<? extends Payment> clazz){
        Payment payment = null;
        if(null != clazz){
            try {
                payment = clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return payment;
    }
}
