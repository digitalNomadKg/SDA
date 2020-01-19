package com.sda.tdd;

public class Math {
    public boolean isOdd(Integer number) {
        try {
            return number % 2 != 0;
        } catch (NullPointerException e) {
            throw new NullPointerException();
        }
    }

    public int findBiggest(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
}
