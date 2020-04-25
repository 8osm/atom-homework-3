package com.osm8.javatom;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ApplicationTest {

    int a;
    int b;
    int expectedResult;


    @Before
    public void setupFields(){
        a = 12;
        b = 3;
    }

    @Test
    public void  testMultiplication(){
        expectedResult = 36;
        Assert.assertEquals(expectedResult, Application.multiply(a, b));
    }

    @Test
    public void  testAddition(){
        expectedResult = 15;
        Assert.assertEquals(expectedResult, Application.add(a, b));
    }
    @Test
    public void  testSubtraction(){
        expectedResult = 9;
        Assert.assertEquals(expectedResult, Application.subtract(a, b));
    }

    @Test
    public void  testDivision(){
        expectedResult = 4;
        Assert.assertEquals(expectedResult, Application.divide(a, b));
    }
}
