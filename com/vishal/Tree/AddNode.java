package com.vishal.Tree;

import java.util.Stack;

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
    public static void printInOrder(Node root) {
        if (root != null) {
            printInOrder(root.left);
            System.out.print(root.data + " ");
            printInOrder(root.right);
        }
    }


    public static void main(String[] args) {

        Integer[] arr = {50, 25, 12, null, null, 37, 30, null, null, 40, null, null,
                75, 62, 60, null, null, 70, null, null, 87, null, null};

        Node root = new Node(arr[0], null, null);
        pair rootPair = new pair(root, 1);

        Stack<pair> st = new Stack<>();
        st.push(rootPair);

        int idx = 0;
        while (st.size() > 0){
            pair top = st.peek();
            if(top.state == 1){
                idx++;
                if (arr[idx] != null){
                    top.node.left = new Node(arr[idx], null, null);
                    pair lp = new pair(top.node.left, 1);
                    st.push(lp);
                }else{
                    top.node.left = null;
                }
                top.state++;
            } else if (top.state == 2) {
                idx++;
                if (arr[idx] != null){
                    top.node.right = new Node(arr[idx], null, null);
                    pair rp = new pair(top.node.right, 1);
                    st.push(rp);
                }else {
                    top.node.right = null;
                }
                top.state++;
            }else {
                st.pop();
            }
        }
        printInOrder(root);
        System.out.println();
    }
}
