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

        private Node getNodeAt(int idx){
            Node temp = head;
            for(int i=0; i<idx; i++){
                temp = temp.next;
            }
            return temp;
        }
        public void reverse(){
            int li = 0;
            int ri = size - 1;

            while (li < ri){
                Node left = getNodeAt(li);
                Node rigth = getNodeAt(ri);

                int temp = left.data;
                left.data = rigth.data;
                rigth.data = temp;

                li++;
                ri--;
            }
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
