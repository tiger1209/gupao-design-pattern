package com.edu.design.mode.decorator;

public class ArticleNaviBar extends NaviBarDecorator {
    public ArticleNaviBar(NaviBar naviBar) {
        super(naviBar);
    }

    private void articleShow(){
        System.out.println("新增功能- 文章页面");
    };

    @Override
    public void show() {
        super.show();
        articleShow();
    }
}
