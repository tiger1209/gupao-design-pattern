package com.edu.design.mode.decorator;

import java.util.ArrayList;
import java.util.List;

public class ShoppingPage extends NaviBarDecorator {

    public ShoppingPage(NaviBar naviBar) {
        super(naviBar);
    }

    private Menu otherPage(){
        Menu menu = new Menu();
        menu.setName("商城");
        menu.setUrl("/shopping");
        return menu;
    }
    @Override
    public List<Menu> show() {
        List menus = new ArrayList();
        menus.add(otherPage());
        menus.add(super.show());
        return menus;
    }
}
