package com.edu.design.mode.decorator;

public class ArticlePage extends NaviBarDecorator {
    public ArticlePage(NaviBar naviBar) {
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
