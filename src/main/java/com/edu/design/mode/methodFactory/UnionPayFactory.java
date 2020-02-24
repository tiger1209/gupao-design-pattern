package com.edu.design.mode.methodFactory;

public class UnionPayFactory implements PayFactory {
    @Override
    public Payment createPayment() {
        return new UnionPay();
    }
}
