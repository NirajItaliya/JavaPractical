package com.company;

import java.time.LocalDateTime;
import java.util.*;

/* Write a program that creates an Array List and adds a Loan object ,
 a Date object , a string, and a Circle object to the list, and use a loop to display all
  elements in the list by invoking the object’s to String() method.*/
public class practical14 {
    public static void main(String[] args) {
        LocalDateTime t1 = LocalDateTime.now();
        System.out.println(t1);
        System.out.println("190130107041 Niraj Italiya 4CEA2");
        System.out.println("Practical - 14");
        System.out.println("--------------------------------------------");
        ArrayList<Object> arr_list = new ArrayList<Object>();
        arr_list.add(new Loan(10000));
        arr_list.add(new Date());
        arr_list.add(new String("Practical14"));
        arr_list.add(new Circle(3.45));
        for (int i = 0; i < arr_list.size(); i++) {
            System.out.println((arr_list.get(i)).toString());
        }
    }
}

class Circle {
    double radius;

    Circle(double r) {
        this.radius = r;
    }

    public String toString() {
        return "Circle with Radius " + this.radius;
    }
}

class Loan {
    double amount;

    Loan(double amt) {
        this.amount = amt;
    }

    public String toString() {
        return "Loan with Amount " + this.amount;
    }
}