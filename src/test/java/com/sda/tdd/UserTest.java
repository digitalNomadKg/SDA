package com.sda.tdd;

import org.junit.Assert;
import org.junit.Test;

public class UserTest {

    @Test
    public void signUpTestShouldReturnTrue() throws UserIsLessThan18 {
        //given
        User user = new User();
        //when
        boolean result = user.signUp("TestName", "TestSurname", 19);
        //then
        Assert.assertTrue(result);

    }

    @Test(expected = UserIsLessThan18.class)
    public void signUpTestThrowException() throws UserIsLessThan18 {
        //given
        User user = new User();
        //when
        boolean result = user.signUp("TestName", "TestSurname", 10);
    }

    @Test
    public void signUpTestShouldReturnFalse() throws UserIsLessThan18 {

        User user = new User();
        boolean result = user.signUp("", "TestSurname", 22);
        Assert.assertFalse(result);

    }
}
