package com.vishal.Stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        for(int i=1; i<=5; i++){
            stack.push(i);
        }
        System.out.println(stack);
        for (int i = 1; i < 5; i++) {
            System.out.println(stack+" "+stack.pop() +" "+ stack.size());
        }
    }
}
