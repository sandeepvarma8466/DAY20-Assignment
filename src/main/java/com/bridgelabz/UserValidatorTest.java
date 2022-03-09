package com.bridgelabz;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserValidatorTest {
    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue(){
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmailAddress("abc@bridgelabz.com");
        Assert.assertTrue(result);
    }
}
