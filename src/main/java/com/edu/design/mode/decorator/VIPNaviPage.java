package com.edu.design.mode.decorator;

import java.util.ArrayList;
import java.util.List;

public class VIPNaviPage extends NaviBarDecorator {

    public VIPNaviPage(NaviBar naviBar) {
        super(naviBar);
    }

    private Menu shoppingPage(){
        Menu menu = new Menu();
        menu.setName("商城");
        menu.setUrl("/shopping");
        return menu;
    }

    private Menu coursePage(){
        Menu menu = new Menu();
        menu.setName("课程");
        menu.setUrl("/course");
        return menu;
    }

    @Override
    public List<Menu> show() {
        List menus = new ArrayList();
        menus.add(shoppingPage());
        menus.add(coursePage());
        menus.add(super.show());
        return menus;
    }
}
