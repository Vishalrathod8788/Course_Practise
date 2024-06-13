package com.vishal.LikedList;

public class Reverse_List {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size;
        public void addFirst(int data){
            Node newNode = new Node(data);
            size++;
            if(head == null){
                head = tail = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public void reverse(){
            Node prev = null;
            Node curr = head;
            while(curr != null){
                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
        }
        public void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.display();
        list.reverse();
        list.display();

    }
}
