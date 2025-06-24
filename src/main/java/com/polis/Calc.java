package com.polis;

public class Calc {

    public static int divide(int a,int b) {
        if (b == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return a / b;
    }

}
