package com.vishal.Tree;

public class AddNode {
    public static class Node{
        int data;
        Node next;
    }

    public static class Tree{
        Node left;
        Node right;
        int data;
        Tree(int data){
            this.data = data;
        }
        Tree(int data, Node left, Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
        public static void addNode(Tree root, int data, boolean isLeft){
            Node node = new Node(data);
            if(isLeft){
                root.left = node;
            }else{
                root.right = node;
            }
        }
        public static void print(Tree root){
            if(root == null){
                return;
            }
            System.out.println(root.data);
            print(root.left);
            print(root.right);
        }
        public static void main(String[] args) {
            Tree root = new Tree(1);
            addNode(root, 2, true);
            addNode(root, 3, false);
            print(root);
        }

    }
}
