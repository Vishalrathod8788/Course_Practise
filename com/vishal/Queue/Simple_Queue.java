package com.vishal.Queue;

public class Simple_Queue {
    int front;
    int rear;
    int size;
    int arr[];
    Simple_Queue(int size){
        this.size = 0;
        this.front = -1;
        this.rear = -1;
        this.arr = new int[size];
    }
    public int add(int val) {
        //Push Data

        if(isEmpty()) {
            front++;
            rear++;
            arr[rear] = val;
            size++;
        }
        return val;
    }
    public int remove() {

        int val = arr[front];
        if (!isEmpty()) {
            val = arr[front];
            front++;
            size--;
        }
        return val;
    }
    public int peek() {
        return arr[front];
    }
    public boolean isEmpty() {
        if(size == 0) return true;
        return false;
    }
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        Simple_Queue queue = new Simple_Queue(5);
        System.out.println(queue.add(10));
        System.out.println(queue.add(20));
        System.out.println(queue.add(30));
        System.out.println(queue.add(40));
        System.out.println(queue.add(50));
        System.out.println(queue.size());
        System.out.println(queue.remove());
        System.out.println(queue.size());
        System.out.println(queue.remove());
        System.out.println(queue.size());
        System.out.println(queue.remove());
        System.out.println(queue.size());

    }
}
