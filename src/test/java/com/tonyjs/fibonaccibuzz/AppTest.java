package com.tonyjs.fibonaccibuzz;

import junit.framework.TestCase;
import com.tonyjs.fibonaccibuzz.App;

public class AppTest extends TestCase
{   
    public void testFirstTenFibonacciNumbers() {
        System.out.println("Testing first ten fibonacci numbers...");
        int t[] = App.initializeTable(10);
        assertEquals(1, t[0]);
        assertEquals(1, t[1]);
        assertEquals(2, t[2]);
        assertEquals(3, t[3]);
        assertEquals(5, t[4]);
        assertEquals(8, t[5]);
        assertEquals(13, t[6]);
        assertEquals(21, t[7]);
        assertEquals(34, t[8]);
        assertEquals(55, t[9]);
    }

    public void testNegativeFib() throws ArrayIndexOutOfBoundsException {
        System.out.println("Testing negative nums...");
        try {
            App.F(0);
            fail("Exception now thrown");
            App.F(-1);
            fail("Exception now thrown");
            App.F(-2);
            fail("Exception now thrown");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    public void testPrimeNumbers() {
        System.out.println("Testing prime numbers...");
        assertTrue(App.isPrime(2));
        assertTrue(App.isPrime(3));
        assertTrue(App.isPrime(5));
        assertFalse(App.isPrime(8));
        assertFalse(App.isPrime(21));
    }
}
