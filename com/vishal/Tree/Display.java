package com.vishal.Tree;

public class Display {

    // Create Constructor
    static class Node {
        int iData;
        Node left;
        Node right;
        Node(int idata, Node left, Node right){
            this.iData = idata;
            this.left = left;
            this.right = right;
        }
    }
    /**
     * Prints the tree in a human-readable format, showing the data stored in each node.
     *
     * @param root The root node of the tree or subtree to be printed.
     */
    
    public static void printTree(Node root) {
        // Traverse the left subtree
        if (root.left != null) {
            printTree(root.left);
        }

        // Print the current node's data
        System.out.println(root.iData);

        // Traverse the right subtree
        if (root.right != null) {
            printTree(root.right);
        }
    }

    /**
     * Prints the tree in a human-readable format, showing the data stored in each node.
     *
     * @param root The root node of the tree or subtree to be printed.
     */
    public static void printTreeInOrder(Node root) {
        // Traverse the left subtree
        if (root.left != null) {
            printTreeInOrder(root.left);
        }

        // Print the current node's data
        System.out.println(root.iData);

        // Traverse the right subtree
        if (root.right != null) {
            printTreeInOrder(root.right);
        }
    }
}
