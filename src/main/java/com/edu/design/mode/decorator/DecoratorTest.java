package com.edu.design.mode.decorator;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.autoconfigure.jsonb.JsonbAutoConfiguration;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DecoratorTest {
    public static void main(String[] args) {
        System.out.println("--------------输出游客登录后的页面---------------");
        NaviBar naviBar = new HomePage();
        List<Menu> homeMenu = naviBar.show();

        Iterator iterator = homeMenu.iterator();
        while (iterator.hasNext()){
            System.out.println(JSONObject.toJSON(iterator.next()));
        }


        System.out.println("--------输出会员登录后的页面----------------");

        VIPNaviPage vipNaviPage = new VIPNaviPage(naviBar);
        List<Menu> ms = vipNaviPage.show();
        Iterator it = ms.iterator();
        while (it.hasNext()){
            System.out.println(JSONObject.toJSON(it.next()));
        }

    }
}
