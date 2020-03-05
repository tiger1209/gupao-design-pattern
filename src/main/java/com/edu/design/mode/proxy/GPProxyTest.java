package com.edu.design.mode.proxy;

import java.util.HashMap;
import java.util.Map;

public class GPProxyTest {

    public static void main(String[] args) {
        try {
            Person obj = (Person) new GPMeipo().getInstance(new Girl());
            System.out.println(obj.getClass());
            Map<String,String> conditon = new HashMap<>();
            conditon.put("height","180CM");
            conditon.put("weight","60KG");
            obj.findLove(conditon);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
