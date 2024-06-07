package com.vishal.stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        for(int i=1; i<5; i++){
            stack.push(i);
        }
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        for (int i = 0; i < 5; i++) {
            System.out.println(stack+" "+stack.pop() +" "+ stack.size());
        }
    }
}
