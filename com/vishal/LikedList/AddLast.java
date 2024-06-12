package com.vishal.LikedList;

public class AddLast {
    public static class Node{
        int data;
        Node next;
    }

    public static class LinkList{
        Node head;
        Node tail;
        int size;

        void AddLast(int val){
            Node temp = new Node();
            temp.data = val;
            temp.next = null;
            if(size == 0){
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
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkList ls = new LinkList();

        ls.Display();
        ls.AddLast(500);
        ls.AddLast(600);
        ls.AddLast(700);
        ls.Display();
        ls.AddLast(1000);
        ls.Display();
    }
}
