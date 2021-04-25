package com.company;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.math.BigInteger;

public class practical16
{
    /* Write a program that prompts the user to enter a decimal number and displays the number
    in a fraction.Hint: Read the decimal number as a string,  extract the integer part and fractional part from the string.
    */
    public static void main(String[] args)
    {
        LocalDateTime t1 = LocalDateTime.now();
        System.out.println(t1);
        System.out.println("190130107041 Niraj Italiya 4CEA2");
        System.out.println("Practical - 16");
        System.out.println("--------------------------------------------");
        Scanner input = new Scanner(System.in);
        Double d;
        System.out.print("Enter a decimal number: ");
        String[] decimal = input.nextLine().split("[.]");
        BigInteger b1 = new BigInteger(decimal[0]);
        BigInteger b2 = new BigInteger((decimal[1]));
        if(decimal[0].charAt(0) == '-')
        {
            d = b1.doubleValue() - (b2.intValue() / Math.pow(10, decimal[1].length()));
        }
        else
        {
            d = b1.doubleValue() + (b2.intValue() / Math.pow(10, decimal[1].length()));
        }
        System.out.println("The fraction number is " +d);
    }
}