package com.company.cp;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter Steps Count : - ");
        int valid_Count = src.nextInt();
        for (int i = 0; i < valid_Count; i++) {
           System.out.println(fibonacci((int) i));
        }

    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        int ln = fibonacci(n - 1) + fibonacci(n - 2);
        return ln;
    }
}
