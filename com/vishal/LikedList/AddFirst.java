package com.vishal.LikedList;

public class AddFirst {

    public static class Node{
        int data;
        Node next;
    }
    public static class Linked_List{
        Node head;
        Node tail;
        int size;

        void Insertion(int val){
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if(size == 0){
                head = tail = temp;
            }else{
                tail = tail.next;
                tail = temp;
            }
        }
    }



    public static void main(String[] args) {
        Linked_List ls = new Linked_List();

        ls.Insertion(10);
    }
}
