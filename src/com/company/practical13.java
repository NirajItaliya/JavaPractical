package com.company;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDateTime;

class practical13 {

    /* Write a program for calculator to accept an expression as a string in which the operands and operator are separated by zero or more spaces.
    For ex: 3+4 and 3 + 4 are acceptable expressions. */

    public static void main(String[] args) {
        LocalDateTime t1 = LocalDateTime.now();
        System.out.println(t1);
        System.out.println("190130107041 Niraj Italiya 4CEA2");
        System.out.println("Practical - 13");
        System.out.println("--------------------------------------------");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Equation : ");
        String string = input.nextLine();
        String a = string.replaceAll(" ", "");

        if (a.length() < 3) {
            System.out.println(
                    "Minimum 2 Opearator and 1 Opearand Required");
            System.exit(0);
        }
        int result = 0;
        int i = 0;
        while (a.charAt(i) != '+' && a.charAt(i) != '-' && a.charAt(i) != '*' && a.charAt(i) != '/') {
            i++;
        }
        switch (a.charAt(i)) {
            case '+':
                result = Integer.parseInt(a.substring(0, i)) + Integer.parseInt(a.substring(i + 1, a.length()));
                break;
            case '-':
                result = Integer.parseInt(a.substring(0, i)) - Integer.parseInt(a.substring(i + 1, a.length()));
                break;
            case '*':
                result = Integer.parseInt(a.substring(0, i)) * Integer.parseInt(a.substring(i + 1, a.length()));
                break;
            case '/':
                result = Integer.parseInt(a.substring(0, i)) / Integer.parseInt(a.substring(i + 1, a.length()));
                break;
        }

        System.out.println(a.substring(0, i) + ' ' + a.charAt(i) + ' ' + a.substring(i + 1, a.length())
                + " = " + result);
    }
}