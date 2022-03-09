package com.bridgelabz;

//import com.beust.jcommander.Parameterized;
import org.testng.Assert;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
@RunWith(Parameterized.class)
public class ValidEmailTest {
    private String email2Test;
    private boolean expectedResult;

    public ValidEmailTest(String email, boolean expectedResult) {
        this.email2Test = email;
        this.expectedResult = expectedResult;
    }
    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]   {
                {"abc@yahoo.com" , true},
                {"abc-100@yahoo.com",true},
                {"abc.100@yahoo.com",true},
                {"abc111@abc.com",true},
                {"abc-100@abc.net",true},
                {"abc.100@abc.com.au",true},
                {"abc@1.com",true},
                {"abc@gmail.com.com",true},
                {"abc+100@gmail.com",true},
                {"abc@",false},
                {"abc@.com.my",false},
                {"abc123@gmail.a",false},
                {"abc123@.com",false},
                {"abc123@.com.com",false},
                {"abc@aabc.com",false},
                {"abc()*@gmail.com",false},
                {"abc@%*.com",false},
                {"abc..2002@gmail.com",false},
                {"abc.@gmail.com",false},
                {"abc@abc@gmail.com",false},
                {"abc@gmail.com.1a",false},
                {"abc@gmail.com.aa.au",false} }  );

    }

    @Test
    public void givenEmail_Valid_ShouldReturnAsPerTheParameterizedResult(){
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmailAddress(this.email2Test);
        Assert.assertEquals(this.expectedResult , true);
    }

}


