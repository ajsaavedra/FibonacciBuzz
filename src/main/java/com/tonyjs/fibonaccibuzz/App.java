package com.tonyjs.fibonaccibuzz;

import java.util.stream.IntStream;

public class App 
{
    public static void F(int n)
    {
        int table[] = initializeTable(n+1);
        for (int i = 0; i < n; i++) {
            int currentFib = table[i];
            if (isPrime(currentFib)) {
                System.out.println("BuzzFizz");
            } else if (currentFib % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (currentFib % 3 == 0) {
                System.out.println("Buzz");
            } else if (currentFib % 5 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(currentFib);
            }
        }
    }

    public static boolean isPrime(int n)
    {
        return IntStream.rangeClosed(1, n).filter(x -> n % x == 0).count() == 2;
    }

    public static int[] initializeTable(int n)
    {
        int table[] = new int[n];
        table[0] = 1;
        table[1] = 1;
        for (int i = 2; i < n; i++) {
            table[i] = table[i-1] + table[i-2];
        }
        return table;
    }
}
