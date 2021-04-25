package com.company;


import java.time.LocalDateTime;
import java.util.PriorityQueue;
public class practical24 {
    public static void main(String[] args)
    {/*Define  MYPriorityQueue class that extends Priority Queue to implement the  Cloneable interface and implement the clone() method to clone a priority queue.*/
        LocalDateTime t1 = LocalDateTime.now();
        System.out.println(t1);
        System.out.println("190130107041 Niraj Italiya 4CEA2");
        System.out.println("Practical - 24\n");
        System.out.println("--------------------------------------------");
        MyPriorityQueue<String> queue = new MyPriorityQueue<>();
        queue.offer("10");
        queue.offer("25");
        queue.offer("36");

        MyPriorityQueue<String> queue1 = null;
        try
        {
            queue1 = (MyPriorityQueue<String>)(queue.clone());
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        System.out.print(queue1);
    }

    static class MyPriorityQueue<E> extends PriorityQueue<E> implements Cloneable
    {
        @Override
        public Object clone() throws CloneNotSupportedException
        {
            MyPriorityQueue<E> clone = new MyPriorityQueue<>();
            this.forEach(clone::offer);
            return clone;
        }

    }
    }