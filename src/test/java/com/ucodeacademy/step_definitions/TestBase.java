package com.ucodeacademy.step_definitions;

import com.ucodeacademy.utility.Driver;
import org.junit.After;
import org.junit.Assert;

public class TestBase {

    //@After  this works with @Test and it runs after each @Test
    public void tearDown2(){
        Driver.quitDriver();
    }
    public void assertTextContains(String actual, String expected){
        Assert.assertTrue("Field!", actual.contains(expected));

    }
}
