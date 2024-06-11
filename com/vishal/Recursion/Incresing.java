package com.vishal.Recursion;

import java.util.Scanner;

public class Incresing {

    public static void main(String[] args) {
//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        inc(n);
    }
    public static void inc(int n){
        if(n == 0){
            System.out.println("--------Incessing---------");
            return;
        }
        System.out.println(n);
        inc(n-1);
        System.out.println(n);
    }
}
