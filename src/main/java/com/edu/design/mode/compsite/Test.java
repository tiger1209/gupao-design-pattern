package com.edu.design.mode.compsite;

public class Test {
    public static void main(String[] args) {
        BranchNode root = new BranchNode("Root", 1);

        BranchNode leaf1 = new BranchNode("Node1 ",2);

        BranchNode leaf1_1 = new BranchNode("Node1-1",3);


        Leaf leaf1_1_1 = new Leaf("Node1-1-1",4);



        leaf1_1.addLeaf(leaf1_1_1);
        leaf1.addLeaf(leaf1_1);
        root.addLeaf(leaf1);
        root.show();
    }
}
