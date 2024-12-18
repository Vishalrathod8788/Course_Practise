package com.vishal.TUF;

public class main {
    public static class Node{
        int data;
        Node next;
    }

    public static class LinkedLiost{
        Node head;
        Node tail;
        int size;

        public void InsertNode(int x){
            Node temp = new Node();
            temp.data = x;
            temp.next = null;

            if(size < 0){
                head = tail = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public static void main(String[] args) {
            LinkedLiost list = new LinkedLiost();
            list.InsertNode(10);
            list.InsertNode(20);
        }
    }
}
