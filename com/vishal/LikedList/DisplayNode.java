package com.vishal.LikedList;

public class DisplayNode {
    public static class Node {
        int data;
        Node next;
    }
    public static class Link {
        Node head;
        Node tail;
        int size;

        void AddNode(int val){
            if (size == 0){
                Node temp = new Node();
                temp.data = val;
                temp.next = null;
                head = tail = temp;
                size++;
            }else {
                Node temp = new Node();
                temp.data = val;
                temp.next = null;
                tail.next = temp;
                tail = temp;
                size++;
            }
        }
    }

    public static void main(String[] args) {
        Link ls = new Link();
        ls.AddNode(1);
        ls.AddNode(2);
        ls.AddNode(3);
        ls.AddNode(4);
        ls.AddNode(5);
    }
}
