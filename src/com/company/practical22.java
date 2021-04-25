package com.company;

import java.time.LocalDateTime;
import java.util.Scanner;

public class practical22 {

/*Write a recursive method that returns the smallest integer in an array.  Write a test program that prompts the user to enter an integer and display its product.*/
    public static void main(String[] args) {
        LocalDateTime t1 = LocalDateTime.now();
        System.out.println(t1);
        System.out.println("190130107041 Niraj Italiya 4CEA2");
        System.out.println("Practical - 22\n");
        System.out.println("--------------------------------------------");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter five integers: ");
        int[] list = new int[5];
        for (int i = 0; i < list.length; i++)
        {
            list[i] = input.nextInt();
        }

        System.out.println("The smallest element is " + min(list));
    }


    public static int min(int[] list)
    {
        int min = list[list.length - 1];
        int index = list.length - 1;
        return min(list, index, min);
    }

    private static int min(int[] list, int index, int min)
    {
        if (index < 0)
        {
            return min;
        }
        else if (list[index] < min)
        {
            return min(list, index - 1, list[index]);
        }
        else
        {
            return min(list, index - 1, min);
        }
    }
}