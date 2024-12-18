package com.vishal.TUF;

public class LL {
    //create node class
    static class Node{
        int data;
        Node next;

        //constructor (insert Ele)
        public Node(int data){
            this.data = data;
            this.next = null;
        }

        //constructor (insert Head)
        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }

        //Default constructor create (Default Constructor)
        public Node(){
            this.data = 0;
            this.next = null;
        }

        //constructor
        public Node(Node head, int data, Node next){
            this.data = data;
            this.next = next;
        }
    }
    public static Node  insertHead(Node head, int data) {
        Node temp = new Node(data, head);
        head = temp;
        return head;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        Node head = new Node(arr[0], null);
        head = insertHead(head, arr[0]);
        System.out.println(head.data);

    }
}
