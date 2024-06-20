package com.vishal.Queue;
public class AddData {

    public static class Queue{

        static int[] arr;
        static int size;
        static int rear;

        Queue(int n){
            int[] arr = new int[n];
            int size = n;
            int rear = -1;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }

        public static int[] Add(int data){
            if(rear == size - 1){
                return arr;
            }else {
                rear++;
                arr[rear] = data;
            }
            return arr;
        }

        public static void remove(){

        }
    }
}
