package com.edu.design.mode.compsite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class BranchNode extends Node {
    private List<Node> branch = new ArrayList<>();
    public BranchNode(String name, int level) {

        super(name, level);
    }

    @Override
    public void show() {
        prefix(this.level);
        System.out.println(this.name);
        for (Node node :branch) {
            node.show();
        }
    }

    public BranchNode addLeaf(Node node){
        branch.add(node);
        return this;
    }

    public BranchNode removeLeaf(Node node){
        branch.remove(node);
        return this;
    }

    public boolean delete(){
        boolean b = this.branch.size() > 0;
        System.out.println(b);
        return b;
    }

}
