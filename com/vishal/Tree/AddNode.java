package com.vishal.Tree;

public class AddNode {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static class pair{
        Node node;
        int state;

        pair(Node node, int state){
            this.node = node;
            this.state = state;
        }

    }

    public static void main(String[] args) {

        Integer[] arr = {50, 25, 12, null, null, 37, 30, null, null, 40, null, null,
                75, 62, 60, null, null, 70, null, null, 87, null, null};

        Node root = new Node(arr[0], null, null);
        pair rootPair = new pair(root, 1);
        int idx = 1;

    }

}
