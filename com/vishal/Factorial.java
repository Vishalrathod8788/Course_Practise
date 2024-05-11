package com.vishal;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        myFact(n);
    }
    // Using Recursion

    public static int myFact(int n){
        if(n == 1){
            return 1;
        }
        int fact = n * myFact(n-1);

        System.out.println(fact);
        return fact;



    }
}
