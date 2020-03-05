package com.edu.design.mode.decorator;

public class ShoppingNaviBar extends NaviBarDecorator {

    public ShoppingNaviBar(NaviBar naviBar) {
        super(naviBar);
    }

    private void otherPage(){
        System.out.println("新增功能- 商城页面");
    }
    @Override
    public void show() {
        super.show();
        otherPage();
    }
}
