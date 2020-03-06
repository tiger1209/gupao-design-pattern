package com.edu.design.mode.decorator;

import java.util.ArrayList;
import java.util.List;

public class ManagerNavPage extends NaviBarDecorator {
    public ManagerNavPage(NaviBar naviBar) {
        super(naviBar);
    }

    private Menu mangerPage(){
        Menu menu = new Menu();
        menu.setName("管理");
        menu.setUrl("/manger");
        return menu;
    };

    @Override
    public List<Menu> show() {
        List mList = new ArrayList<>();
        mList.add(mangerPage());
        mList.add(super.show());

        return mList;
    }
}
