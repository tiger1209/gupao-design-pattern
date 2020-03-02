package com.edu.design.mode.proxy;


import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class GPMeipo implements GPInvocationHandler {
    private Object target;
    public Object getInstance(Object person) throws Exception{
        this.target = person;
        Class<?> clazz = target.getClass();
        return GPProxy.newProxyInstance(new GPClassLoader(),clazz.getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target,args);
        after();
        return obj;
    }

    private void before(){
        System.out.println("我是媒婆,我要帮你介绍对象");
    }

    private void after(){
        System.out.println("准备办事");
    }
}
