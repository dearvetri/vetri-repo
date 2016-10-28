package com.developer.vk.fibonacci;

public class Fibonacci {


    //X(n) = X(n-1) + X(n-2)
    public int fibonacci(int n) {
        if(n < 0) {
            throw new IllegalArgumentException("Invalid input to calculate fibonacci");
        }
        if(n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public String fibonacciUsingLoop(int n) {
        String result = "";

        return result;
    }

}
