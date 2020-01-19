package com.sda.tdd;

import org.junit.Assert;
import org.junit.Test;

public class MathTest {

    @Test
    public void isOddTestSuccessful() {
        //given
        Math math = new Math();
        //when
        //then
        Assert.assertTrue(math.isOdd(1));
    }

    @Test(expected = NullPointerException.class)
    public void isOddShouldreturnFailure() {
        Math math = new Math();
        boolean b = math.isOdd(null);

    }

    @Test
    public void isFindBiggest() {
        //given
        Math math = new Math();
        int result = math.findBiggest(3, 5);
        Assert.assertEquals(5, result);
    }
}
