package com.company.cp;

import com.sun.org.apache.xpath.internal.operations.Variable;

import java.util.*;

public class cp1 {
    public static void main(String[] args) {

       List<Integer> list = new ArrayList<Integer>();
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number- ");
        int a= sc.nextInt();

        for (int i = 0; i < a; i++) {
            list.add(new Random().nextInt(100));
        }
        Collections.sort(list);
        for(int lint : list) {
            System.out.println(lint);
        }
    }
}
class MyClass
{
    public int numbers;
    public String mnum;

    public int getNumbers() {
        return numbers;
    }

    public String getMnum() {
        return mnum;
    }

    public MyClass(int numbers, String mnum) {
        this.numbers = numbers;
        this.mnum = mnum;
    }
}
