package com.example;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {
    
    @Test
    public void test_sqrt() {
        double val = 36.0;
        double expectedResult = 6.0;
        double result = App.sqrt(val);
        Assert.assertEquals(expectedResult, result, 0.0f);
    }

    @Test
    public void test_fact() {
        int a = 7;
        int expectedResult = 5040;
        int result = App.fact(a);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void test_log10() {
        double a = 100.0;
        double expectedResult = 2.0;
        double result = App.log10(a);
        Assert.assertEquals(expectedResult, result, 0.2f);
    }

    @Test
    public void test_power() {
        int a = 3;
        int b = 4;
        int expectedResult = 81;
        double result = App.power(a,b);
        Assert.assertEquals(expectedResult, result, 0.0f);
    }
}