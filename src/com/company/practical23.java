package com.company;

import java.time.LocalDateTime;

public class practical23 {
    public static void main(String[] args)
    {
        LocalDateTime t1 = LocalDateTime.now();
        System.out.println(t1);
        System.out.println("190130107041 Niraj Italiya 4CEA2");
        System.out.println("Practical - 23");
        System.out.println("--------------------------------------------");
        Integer[][] list = new Integer[15][15];
        int value = 0;
        for (int i = 0; i < list.length; i++)
        {
            for (int j = 0; j < list[i].length; j++)
            {
                list[i][j] = value++;
            }
        }
        System.out.println("Max = " + max(list));
    }

    public static <E extends Comparable<E>> E max(E[][] list)
    {
        E max = list[0][0];
        for (E[] elements : list)
        {
            for (E element : elements)
            {
                if (element.compareTo(max) > 0)
                {
                    max = element;
                }
            }
        }
        return max;
    }
}