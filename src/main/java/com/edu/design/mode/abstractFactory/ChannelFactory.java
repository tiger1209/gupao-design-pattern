package com.edu.design.mode.abstractFactory;

public class ChannelFactory extends PayFactory{


    @Override
    public IExternalPay createExternalPayment(Class<? extends IExternalPay> clz) {
        System.out.println("跨境支付渠道");
        super.init();
        try {
            return  clz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public IInternalPay createInternalPayment(Class<? extends IInternalPay> clz) {
        System.out.println("国内支付渠道");
        super.init();
        try {
            return clz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

}
