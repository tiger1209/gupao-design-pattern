package com.edu.design.mode.decorator;

import java.util.List;

public abstract class NaviBarDecorator implements NaviBar{
    private NaviBar naviBar;
    public NaviBarDecorator(NaviBar naviBar) {
        this.naviBar = naviBar;
    }

    @Override
    public List<Menu> show() {
         return naviBar.show();
    }
}
