package com.vishal.LikedList;

public class AddFirst {

//    public static class Node{
//        int data;
//        Node next;
//    }
//    public static class Linked_List{
//        Node head;
//        Node tail;
//        int size;
//
//        void Insertion(int val){
//            Node temp = new Node();
//            temp.data = val;
//            temp.next = null;
//
//            if(size == 0){
//                head = tail = temp;
//            }else{
//                tail = tail.next;
//                tail = temp;
//            }
//        }
//    }



    public static void main(String[] args) {
        InsertNode.LikedList add = new InsertNode.LikedList();
        DisplayNode.Link display = new DisplayNode.Link();
        add.addNode(100);
        add.addNode(200);
        add.addNode(300);
        add.addNode(400);
        add.addNode(500);

        display.Display();

    }
}
