package com.vishal.String;

import java.util.Scanner;

public class NumToSpelling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        Spelling(Integer.parseInt(n));
    }
    public static void Spelling(int n){
        String[] arr = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        if(n == 0){
            return;
        }
        Spelling(n/10);
        System.out.print(arr[n%10] + " ");
    }
}
