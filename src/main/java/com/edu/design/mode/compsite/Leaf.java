package com.edu.design.mode.compsite;

public class Leaf extends Node {

    public Leaf(String name, int level) {
        super(name, level);
    }

    @Override
    public void show() {
        prefix(this.level);
        System.out.println(this.name);
    }
}
