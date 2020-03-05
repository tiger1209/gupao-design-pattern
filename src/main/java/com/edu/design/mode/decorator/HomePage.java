package com.edu.design.mode.decorator;

public class HomePage implements NaviBar {
    @Override
    public void show() {
        System.out.println("主页");
    }
}
