package com.vishal.LikedList;

public class Remove_Last {

    public static class Node{
        int data;
        Node next;
    }

    public static class  LinkedList{
        Node head;
        Node tail;
        int size;

        void AddNode(int val){
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

        void Display(){
            Node temp = head;
            while(temp != null){
                System.out.println(temp.data);
                temp= temp.next;
            }
        }

        //Remove Last Node :
        void RemoveLast(){
            Node temp = head;
            for (int i=0; i<size-2; i++){
                temp = temp.next;
            }
            tail = temp.next;
            temp.next = null;
            size--;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.AddNode(1);
        list.AddNode(2);
        list.AddNode(3);
        list.AddNode(4);
        list.AddNode(5);
        list.RemoveLast();
        list.Display();
    }
}