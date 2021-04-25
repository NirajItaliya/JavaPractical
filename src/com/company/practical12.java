package com.company;

import java.time.LocalDateTime;
import java.util.Random;

public class practical12 {
    /* Write a program that creates a Random object with seed
     1000 and displays the first 100 random integers between 1 and
     49 using the NextInt (49) method. */

    public static void main(String[] args) {
        LocalDateTime t1 = LocalDateTime.now();
        System.out.println(t1);
        System.out.println("190130107041 Niraj Italiya 4CEA2");
        System.out.println("Practical - 12");
        System.out.println("--------------------------------------------");
        Random rand = new Random(1000);
        for (int i = 0; i < 100; i++) {
            System.out.format("%3d", rand.nextInt(49));
            if ((i + 1) % 20 == 0) {
                System.out.println();
            }
        }
    }
}
