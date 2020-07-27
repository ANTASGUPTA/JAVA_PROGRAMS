package com.antas;

import java.util.Scanner;

public class Linear_Search {

    public static void main(String args[])
    {
        int c, n, search, array[];

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements");
        n = in.nextInt();
        array = new int[n];

        System.out.println("Enter those " + n + " elements");

        for (c = 0; c < n; c++)
            array[c] = in.nextInt();

        System.out.println("Enter the value to find");
        search = in.nextInt();

        for (c = 0; c < n; c++)
        {
            if (array[c] == search)     /* Condition to check if the Searching element is found */
            {
                System.out.println(search + " is present at location " + (c + 1) + ".");
                break;
            }
        }
        if (c == n)  /* If the Element to search is not found. */
            System.out.println(search + " isn't present in array.");
    }
}