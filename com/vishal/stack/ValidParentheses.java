package com.vishal.stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public static boolean main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Stack<Character> st = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }else{
                if(st.isEmpty()){
                    return false;
                }
                char top = st.pop();
                if (ch == ')' && top != '(' || ch == ']' && top != '[' || ch == '}' &&  top != '{'){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
