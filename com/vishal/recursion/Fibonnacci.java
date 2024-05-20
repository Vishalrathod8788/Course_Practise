package com.vishal.recursion;

import java.util.Scanner;

public class Fibonnacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        fib(n);
        for(int i=0;i<n;i++){
            System.out.print(fib(i)+" ");
        }
    }
    //write a function to print fibonnacci series using recursion
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}
