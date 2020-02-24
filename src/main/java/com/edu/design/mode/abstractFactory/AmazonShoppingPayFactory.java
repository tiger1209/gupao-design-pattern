package com.edu.design.mode.abstractFactory;

public class AmazonShoppingPayFactory extends ShoppingPayFactory{

    @Override
    public IExternalPay createExternalPayment() {
        System.out.println("亚马逊：跨境支付渠道");
        super.init();
        return new Payoneer();
    }

    @Override
    public IInternalPay createInternalPayment() {
        System.out.println("亚马逊：国内支付渠道");
        super.init();
        return new AliPay();
    }
}
