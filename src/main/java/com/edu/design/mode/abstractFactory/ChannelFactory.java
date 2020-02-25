package com.edu.design.mode.abstractFactory;

public class ChannelFactory extends PayFactory{

    @Override
    public IExternalPay createExternalPayment() {
        System.out.println("跨境支付渠道");
        super.init();
        return new Payoneer();
    }

    @Override
    public IInternalPay createInternalPayment() {
        System.out.println("国内支付渠道");
        super.init();
        return new AliPay();
    }
}
