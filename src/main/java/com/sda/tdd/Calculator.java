package com.sda.tdd;

public class Calculator {
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int div(int a, int b) {
        try{return a / b;
        }catch (ArithmeticException e){
            throw new ArithmeticException();
        }
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

}
