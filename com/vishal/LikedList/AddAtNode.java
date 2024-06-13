package com.vishal.LikedList;

public class AddAtNode {
    public static class Node{
        int data;
        Node next;
    }

    public static class LinkList{
        Node head;
        Node tail;
        int size;



        // Add Last Node
        public void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;
            if (size == 0) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            System.out.println(temp.data);
        }
        public void addFirst(int val){
            Node temp = new Node();
            temp.data = val;
            temp.next = head;
            head = temp;
            if(size == 0){
                tail = temp;
            }
            size++;
        }

        public void display() {
            Node temp = head;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

        //Add Node at Index
//        public void addAt(int idx, int val){
//            if(idx < 0 || idx > size){
//                System.out.println("Invalid Index");
//            }else if(idx == 0){
//                addNode(val);
//            }else if(idx == size){
//                addNode(val);
//            }else{
//                Node temp = head;
//                for(int i = 0; i < idx - 1; i++){
//                    temp = temp.next;
//                }
//                Node node = new Node();
//                node.data = val;
//                node.next = temp.next;
//                temp.next = node;
//            }
//        }

        //MyCode
        public void addAt(int idx, int val){
            if(idx < 0 || idx > size){
                System.out.println("Invalid Input");
            } else if (size == 0) {
                addFirst(val);
            } else if (idx == size) {
                addLast(val);
            } else {
                Node node = new Node();
                node.data = val;
                Node temp = head;
                for (int i=0; i < idx - 1; i++) {
                    temp = temp.next;
                }
                node.next = temp.next;
                temp.next = node;
                size++;
            }
        }

        public static void main(String[] args) {
            LinkList list = new LinkList();
            list.addLast(10);
            list.addLast(20);
            list.addLast(30);
            list.addLast(40);

            list.addAt(1,100);


        }
    }
}
