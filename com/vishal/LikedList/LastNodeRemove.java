package com.vishal.LikedList;

public class LastNodeRemove {
    static class Node {
        int data;
        Node next;
    }
    public static class removeLastNode {
        Node head;
        Node tail;
        int size;

        //Insertion
        public void Insert(int data) {
            Node node = new Node();
            node.data = data;
            node.next = null;
            if (head == null) {
                head = tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
            size++;
        }

        //Display
        public void Display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        public void RemoveLastNode(){
            if(size==0){
                System.out.println("List is empty");
            }
            else if(size==1){
                head=tail=null;
                size=0;
            }
            else{
                Node temp=head;
                for(int i=0;i<size-2;i++){
                    temp=temp.next;
                }
                temp.next=null;
                tail=temp;
                size--;
            }
        }

    }

    public static void main(String[] args) {

        removeLastNode ls = new removeLastNode();
        ls.Insert(10);
        ls.Insert(20);
        ls.Insert(30);
        ls.Insert(40);
        ls.Insert(50);
        ls.Insert(60);
        ls.Insert(70);
        ls.Insert(80);
        ls.Insert(90);
        ls.Insert(100);

        ls.Display();
        ls.RemoveLastNode();
        System.out.println();
        ls.Display();
    }
}
