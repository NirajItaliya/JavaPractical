package com.company;

import java.time.LocalDateTime;
import java.util.Scanner;
public class practical9 {
/*Write a method with following method header.public static int gcd(int num1, int num2)Write a program that prompts the user to enter two integers and compute the gcd of two integers.*/
        public static int gcd(int num1, int num2)
        {
            while (num1 != num2)
            {
                if(num1 > num2)
                {
                    num1 = num1 - num2;
                }
                else
                {
                    num2 = num2 - num1;
                }
            }
            return num1;
        }
        public static void main(String[] args)
        {
            LocalDateTime time = LocalDateTime.now();
            System.out.println(time);

            System.out.println("190130107041 Niraj Italiya 4CEA2");
            System.out.println("Practical - 9\n");

            Scanner input = new Scanner(System.in);
            System.out.print("Enter First Number  : ");
            int number1 = input.nextInt();
            System.out.print("Enter Second Number : ");
            int number2 = input.nextInt();
            System.out.print("GCD of "+number1+" and "+number2+" = "+gcd(number1, number2));
        }
    }