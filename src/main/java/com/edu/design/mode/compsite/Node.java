package com.edu.design.mode.compsite;

import java.util.List;

public abstract class Node {
    protected String name;
    protected int level;

    public Node(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public abstract void show();

    protected void prefix(int level){
        for(int i = 1 ; i < level; i++){
            System.out.print("+");
        }
    }
}
