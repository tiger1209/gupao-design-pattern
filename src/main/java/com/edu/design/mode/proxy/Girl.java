package com.edu.design.mode.proxy;


import java.util.Map;


public class Girl implements Person {
    public void findLove(Map<String,String> condition) {
        System.out.println("我的条件是："+condition);
    }
}
