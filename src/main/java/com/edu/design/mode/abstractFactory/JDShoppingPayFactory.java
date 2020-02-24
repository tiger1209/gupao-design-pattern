package com.edu.design.mode.abstractFactory;

public class JDShoppingPayFactory extends ShoppingPayFactory {
    @Override
    public IExternalPay createExternalPayment() {
        System.out.println("京东：跨境支付渠道");
        super.init();
        return new PayPal();
    }

    @Override
    public IInternalPay createInternalPayment() {
        System.out.println("京东：国内支付渠道");
        super.init();
        return new JDPay();
    }
}
