package com.vishal.stack;

import java.util.Stack;

public class DuplicateBracket {
    public static void main(String[] args) {
        String  str = "(a+b) + (c+d)";
        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ')'){
                if(st.peek() == '('){
                    System.out.println("Duplicate");
                    return;
                }else{
                    while (st.peek() != '('){
                        st.pop();
                    }
                    System.out.println("Not Duplicate");
                    return;
                }
            }else{
                st.push(ch);
            }
        }
    }
}
