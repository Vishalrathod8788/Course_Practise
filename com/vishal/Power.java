package com.vishal;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        MathPow(n);
    }
    public static int MathPow(int n){
        if (n == 0)
            return 1;
        int res = 2 * MathPow(n-1);
        System.out.println(res);
        return res;
    }
}
