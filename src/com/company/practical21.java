package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class practical21 {


    public static void main(String[] args) {
        LocalDateTime t1 = LocalDateTime.now();
        System.out.println(t1);
        System.out.println("190130107041 Niraj Italiya 4CEA2");
        System.out.println("Practical - 11 (extension-2)\n");
        System.out.println("--------------------------------------------");
        try (
                PrintWriter pw = new PrintWriter(new FileOutputStream(new File("F:\\java\\java intehit\\practicals\\src\\private.txt"), true));
        ) {
            for (int i = 0; i < 150; i++)
            {
                pw.print((int)(Math.random() * 150) + " ");
                if (i%20 == 0 ) {
                    System.out.println("\n");
                }
            }
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("Cannot create the file.");
            fnfe.printStackTrace();
        }
    }

}