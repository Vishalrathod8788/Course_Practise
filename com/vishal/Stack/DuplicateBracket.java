package com.vishal.Stack;

import java.util.Stack;

public class DuplicateBracket {
    public static void main(String[] args) {
        String str = "(a + (b))"; // Replace with your expression

        Stack<Character> st = new Stack<>();
        boolean hasDuplicates = false; // Flag to track duplicate brackets

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Ignore characters other than brackets and operands
            if (!Character.isLetterOrDigit(ch) && ch != '(' && ch != ')') {
                continue;
            }

            if(ch == ')') {
                if(st.peek() == '(') {
                    hasDuplicates = true; // Set flag if duplicate brackets found
                } else {
                    while(st.peek() != '(' && !st.isEmpty()) { // Handle extra closing brackets
                        st.pop();
                    }
                    if (!st.isEmpty()) { // Check for unbalanced opening bracket after popping
                        st.pop(); // Pop the opening bracket '('
                    } else {
                        System.out.println("Unbalanced brackets (extra closing)"); // Extra closing bracket
                        return;
                    }
                }
            } else {
                st.push(ch);
            }
        }

        if (hasDuplicates) {
            System.out.println("True"); // Print True if duplicates found
        } else if (st.isEmpty()) {
            System.out.println("False"); // Print False for no duplicates and balanced brackets
        } else {
            System.out.println("Unbalanced brackets (extra opening)"); // Unbalanced opening bracket
        }
    }
}

