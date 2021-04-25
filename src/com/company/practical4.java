package com.company;

import java.time.LocalDateTime;
import java.util.Scanner;

public class practical4
    {/*Body Mass Index (BMI) is a measure of health on weight.  It can be calculated by taking your weight in kilograms
     and dividing by the square of your height in meters.  Write  a  program that prompts the user to enter a weight in
     pounds and height in inches and displays the BMI.Note:-1
     pound=.45359237 Kg and 1 inch=.0254 meters.*/
    public static void main(String[] args)
    {
        LocalDateTime t1 = LocalDateTime.now();
        System.out.println(t1);
        System.out.println("190130107041 Niraj Italiya 4CEA2");
        System.out.println("Practical - 4\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Weight (in pounds) : ");
        Float W = sc.nextFloat();

        System.out.print("Enter Height (in inches) : ");
        Float H = sc.nextFloat();

        W = (float) (0.4536 * W);
        H = (float) (H * 0.0254);

        float BMI = W/(H * H);

        System.out.println("Body Mass Index is " + BMI);
    }
}