package com.company;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Scanner;

public class practical5
{
    /* Write a program that prompts the user to enter three integers and display the integers in decreasing order. */

    public static void main(String[] args)
    {
        LocalDateTime t1 = LocalDateTime.now();
        System.out.println(t1);
        System.out.println("190130107041 Niraj Italiya 4CEA2");
        System.out.println("Practical - 5\n");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter three integers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int temp = 0;

        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("Descending order : " + num1+" "+num2+" "+num3);

    }
}