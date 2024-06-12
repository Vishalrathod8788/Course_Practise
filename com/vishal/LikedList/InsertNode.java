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
            if (size == 0){
                Node temp = new Node();
                temp.data = val;
                temp.next = null;
                head = tail = null;
                size++;
            }else {
                Node temp = new Node();
                temp.data = val;
                temp.next = null;
                tail.next = temp;
                tail = temp;
            }
        }
    }

    public static void main(String args[]){
        LikedList ls = new LikedList();

    }
}