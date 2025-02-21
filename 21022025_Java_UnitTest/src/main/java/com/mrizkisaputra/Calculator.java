package com.mrizkisaputra;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public Integer divide(Integer a, Integer b) {
        if (a == 0 || b == 0) {
            throw new ArithmeticException("Tidak bisa dibagi dengan 0");
        }
        return a / b;
    }
}
