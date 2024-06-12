package com.vishal.LikedList;

public class AddFirst {

    public static class Node{
        int data;
        Node next;
    }

    public static class LinkList{
        Node head;
        Node tail;
        int size;

        void Insert(int val){
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

        void AddNode(int val){
            Node temp = new Node();
            temp.data = val;
            temp.next = head;
            head = temp;

            if (size == 0){
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
    }

    public static void main(String[] args) {
        LinkList ls = new LinkList();
        ls.AddNode(1000);

        ls.Insert(100);
        ls.Insert(200);
        ls.Insert(300);
        ls.Insert(400);
        ls.Insert(500);

        ls.Display();

    }
}
