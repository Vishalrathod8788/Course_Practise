package com.vishal.LikedList;

public class InsertNode {
    public static class Node{
        int data;
        Node next;
    }
    public static class LikedList{
        Node head;
        Node tail;
        int size;

        void addNode(int val){
            Node temp = new Node();
            temp.data = val;
            temp.next = null;
            if (size == 0){
                head = tail = temp;
            }else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
    }

    public static void main(String[] args){
        LikedList ls = new LikedList();
        ls.addNode(10);
        ls.addNode(20);
        ls.addNode(30);
        ls.addNode(40);
        ls.addNode(50);
    }
}