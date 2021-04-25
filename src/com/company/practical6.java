package com.company;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Scanner;

public class practical6 {
    /*Write a program that prompts the user to enter a letter and check whether a letter is a vowel or constant.*/
    public static void main(String[] args) {
        LocalDateTime t1 = LocalDateTime.now();
        System.out.println(t1);
        System.out.println("190130107041 Niraj Italiya 4CEA2");
        System.out.println("Practical - 6\n");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter one character : ");
        char c = input.next().charAt(0);

        boolean lowercase_vowel = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');

        boolean uppercase_vowel = (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');

        if (lowercase_vowel || uppercase_vowel)
            System.out.println(c + " is a vowel.");
        else
            System.out.println(c + " is a consonant.");


    }

}