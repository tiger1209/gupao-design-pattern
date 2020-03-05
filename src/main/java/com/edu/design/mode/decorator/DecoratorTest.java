package com.edu.design.mode.decorator;

public class DecoratorTest {
    public static void main(String[] args) {
       NaviBar naviBar = new HomePage();
        /*naviBar.show();*/

        ShoppingNaviBar shoppingNaviBar = new ShoppingNaviBar(naviBar);
        shoppingNaviBar.show();

        ArticleNaviBar articleNaviBar = new ArticleNaviBar(naviBar);
        articleNaviBar.show();

    }
}
