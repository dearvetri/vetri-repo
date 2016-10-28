package com.developer.vk.fibonacci;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

    Fibonacci fib = new Fibonacci();

    @Test(expected = IllegalArgumentException.class)
    public void testFibonacciForNegativeNumber() {
        fib.fibonacci(-1);
    }

    @Test
    public void testFibonacciForZero() {
        Assert.assertEquals(0, fib.fibonacci(0));
    }

    @Test
    public void testFibonacciForOne() {
        Assert.assertEquals(1, fib.fibonacci(1));
    }

    @Test
    public void testFibonacciForTwo() {
        Assert.assertEquals(1, fib.fibonacci(2));
    }

    @Test
    public void testFibonacciForThree() {
        Assert.assertEquals(2, fib.fibonacci(3));
    }

    @Test
    public void testFibonacciForFive() {
        Assert.assertEquals(8, fib.fibonacci(6));
    }

    @Test
    public void testFibonacciUsingLoopForZero() {
        Assert.assertEquals("0", fib.fibonacciUsingLoop(0));
    }

    @Test
    public void testFibonacciUsingLoopForOne() {
        Assert.assertEquals("0,1", fib.fibonacciUsingLoop(1));
    }

}
