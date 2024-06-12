package com.vishal.LikedList;

public class GetVal {
    public static class Node{
        int data;
        Node next;
    }
    public static class List{
        Node head;
        Node tail;
        int size;

        void getSize(){
            System.out.println(size);
        }
        void addLast(int val){
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if (size == 0){
                head = tail = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        void getFirst(){
            if (size == 0){
                System.out.println("List is empty");
            }
            System.out.println(head.data);
        }
        void getLast(){
            if (size == 0){
                System.out.println("List is empty");
            }
            System.out.println(tail.data);
        }

        void getAt(int idx){
            if(size == 0){
                System.out.println("List is empty");
            } else if (idx < 0 || idx >= size) {
                System.out.println("Invalid Arguments");
            } else{
                Node temp = head;
                for(int i=0; i<idx; i++){
                    temp = temp.next;
                }
                System.out.println(temp.data);
            }
        }

    }

    public static void main(String[] args) {
        List list = new List();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.getSize();
        list.getFirst();
        list.getLast();
        list.getAt(3);

    }
}
