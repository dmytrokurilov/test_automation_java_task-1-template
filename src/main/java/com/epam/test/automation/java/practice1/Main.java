package com.epam.test.automation.java.practice1;

public class Main {

    private Main()
    {

    }

    public static int task1(int n)
    {
        int result;
        if (n > 0)
        {
            result = n * n;
        }
        else
        {
            result = -n;
        }
        return result;
    }

    public static int task2(int n)
    {
        int a = n / 100;
        int b = n /10 % 10;
        int c = n % 10;
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        int middle = a + b + c - max - min;
        return max * 100 + middle * 10 + min;
    }

}