package com.edu.design.mode.abstractFactory;

public abstract class ShoppingPayFactory {
    public void init(){
        System.out.println("支付安全准备工作！");
    }
    public abstract IExternalPay createExternalPayment();
    public abstract IInternalPay createInternalPayment();
}
