package com.edu.design.mode.decorator;

public abstract class NaviBarDecorator implements NaviBar{
    private NaviBar naviBar;
    public NaviBarDecorator(NaviBar naviBar) {
        this.naviBar = naviBar;
    }

    @Override
    public void show() {
        naviBar.show();
    }
}
