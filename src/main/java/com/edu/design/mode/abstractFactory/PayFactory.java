package com.edu.design.mode.abstractFactory;

public abstract class PayFactory {
    public void init(){
        System.out.println("支付安全准备工作！");
    }
    public abstract IExternalPay createExternalPayment(Class< ? extends IExternalPay> clz);
    public abstract IInternalPay createInternalPayment(Class< ? extends IInternalPay> clz);
}
