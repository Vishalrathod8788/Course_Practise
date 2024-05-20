package com.vishal.recursion;

import java.util.Scanner;

public class Decrising {
    public static void main(String[] args) {
//        for (int i = 10; i >= 1; i--) {
//            System.out.println(i);
//        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dec(n);
    }

    public static void dec(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        dec(n-1);
    }
}

