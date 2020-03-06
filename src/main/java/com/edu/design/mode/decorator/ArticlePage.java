package com.edu.design.mode.decorator;

import java.util.ArrayList;
import java.util.List;

public class ArticlePage extends NaviBarDecorator {
    public ArticlePage(NaviBar naviBar) {
        super(naviBar);
    }

    private Menu articleShow(){
        Menu menu = new Menu();
        menu.setName("文章");
        menu.setUrl("/article");
        return menu;
    };

    @Override
    public List<Menu> show() {
        List mList = new ArrayList<>();
        mList.add(articleShow());
        mList.add(super.show());

        return mList;
    }
}
