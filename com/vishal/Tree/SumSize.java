package com.vishal.Tree;

public class SumSize {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int sum(Node node){
        if(node == null){
            return 0;
        }

        int ls = sum(node.left);
        int rs = sum(node.right);
        int ts = ls + rs + node.data;

        return ts;
    }

    public static int size(Node node){
        if(node == null){
            return 0;
        }
        int ls = size(node.left);
        int rs = size(node.right);
        int ts = ls + rs + 1;

        return ts;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int sum = sum(root);
        System.out.println("Sum of all nodes: " + sum);

        int total = size(root);
        System.out.println("Size of tree: " + total);
    }
}
