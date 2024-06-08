package com.vishal.stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        Stack<Character> st = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }else{
                if(st.isEmpty()){
                    System.out.println(true);
                    return;
                }
                char top = st.pop();
                if (ch == ')' && top != '(' || ch == ']' && top != '[' || ch == '}' &&  top != '{'){
                    System.out.println(false);
                    return;
                }
            }
        }
        if(st.isEmpty()){
            System.out.println(true); // All parentheses are valid
        } else {
            System.out.println(false); // Some parentheses are left unmatched
        }
    }
}

