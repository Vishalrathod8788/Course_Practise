package com.vishal.stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> satck = new Stack<>();
        satck.push(1);
        satck.push(2);
        satck.push(3);
        System.out.println(satck.peek());

    }
}
