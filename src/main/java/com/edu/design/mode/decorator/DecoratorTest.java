package com.edu.design.mode.decorator;

public class DecoratorTest {
    public static void main(String[] args) {
       NaviBar naviBar = new HomePage();
        /*naviBar.show();*/

        ShoppingPage shopping = new ShoppingPage(naviBar);
        shopping.show();

        ArticlePage article = new ArticlePage(naviBar);
        article.show();

    }
}
