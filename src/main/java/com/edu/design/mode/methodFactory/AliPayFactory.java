package com.edu.design.mode.methodFactory;

public class AliPayFactory implements PayFactory {
    @Override
    public Payment createPayment() {
        return new AliPay();
    }
}
