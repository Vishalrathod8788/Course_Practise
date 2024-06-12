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
            while (temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Link ls = new Link();

        //Add Node
        ls.AddNode(1);
        ls.AddNode(2);
        ls.AddNode(3);
        ls.AddNode(4);
        ls.AddNode(5);

        //Display Node
        ls.Display();
    }
}
