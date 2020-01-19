package com.sda.tdd;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        // given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.add(6, 2, 2);
        //then
        assert result == 10;
    }

    @Test
    public void testDiv() {
        // given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.div(6, 3);
        //then
        assert result == 2;

    }

    @Test(expected = ArithmeticException.class)
    public void testDivideShouldReturnArithmeticException() {
        //given
        Calculator calculator = new Calculator();

        //when
        calculator.div(3, 0);

        //then
        //should return an exception
    }

    @Test
    public void testMul() {
        // given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.mul(6, 2);
        //then
        assert result == 12;
    }

    @Test
    public void testSub() {
        // given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.sub(6, 2);
        //then
        assert result == 4;
    }


}
