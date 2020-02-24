package com.edu.design.mode.methodFactory;

public abstract  class Payment {
    public void init(){
        System.out.println("初始化支付方式");
    }

    public abstract void pay(String orderId,Double money);
}
