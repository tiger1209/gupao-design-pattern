package com.edu.design.mode.decorator;

import java.util.ArrayList;
import java.util.List;

public class HomePage implements NaviBar {

    @Override
    public List<Menu> show() {
        Menu menu = new Menu();
        menu.setName("首页");
        menu.setUrl("/homePage");
        List mList = new ArrayList();
        mList.add(menu);
        return mList;
    }
}
