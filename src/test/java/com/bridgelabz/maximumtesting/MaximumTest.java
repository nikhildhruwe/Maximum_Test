package com.bridgelabz.maximumtesting;

import com.bridgelabz.maximum.utility.Maximum;
import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    //Test Case for Integers
    @Test
    public void givenMaximumNumber_WhenAtFirstPosition_ShouldReturnSameNumber() {
        Maximum<Integer> maximum = new Maximum<>(60, 40, 10);
        int result = maximum.maximumValue();
        Assert.assertEquals( 60, result);
    }

    public void givenMaximumNumber_WhenAtSecondPosition_ShouldReturnSameNumber() {
        Maximum<Integer> maximum = new Maximum<>(30, 40, 10);
        int result = maximum.maximumValue();
        Assert.assertEquals(40, result);
    }

   @Test
    public void givenMaximumNumber_WhenAtThirdPosition_ShouldReturnSameNumber() {
        Maximum<Integer> maximum = new Maximum<>(30, 40, 50);
        int result = maximum.maximumValue();
        Assert.assertEquals( 50, result);
    }

    @Test
    public void givenIntegers_WhenMaximumAtThirdPosition_ShouldReturnSameNumber() {
        Maximum<Integer> maximum = new Maximum<>(30,10,60,40,50);
        Integer result = maximum.maximumValue();
        Assert.assertEquals((Integer) 60,result);
    }

    //Test case for Float 
    @Test
    public void givenMaximumFloatNumber_WhenAtFirstPosition_ShouldReturnSameNumber() {
        Maximum<Float> maximum = new Maximum<>(3.3f,2.2f,1.1f);
        Float result= maximum.maximumValue();
        Assert.assertEquals( (Float) 3.3f,result);
    }

    @Test
    public void givenMaximumFloatNumber_WhenAtThirdPosition_ShouldReturnSameNumber() {
        Maximum<Float> maximum = new Maximum<>(3.3f,20.6f,40.1f);
        Float result= maximum.maximumValue();
        Assert.assertEquals( (Float) 40.1f,result);
    }

    @Test
    public void givenMaximumFloatNumber_WhenAtSecondPosition_ShouldReturnSameNumber() {
        Maximum<Float> maximum = new Maximum<>(3.3f,20.6f,1.1f);
        Float result= maximum.maximumValue();
        Assert.assertEquals( (Float) 20.6f,result);
    }

    @Test
    public void givenFloatNumber_WhenMaximumAtSecondPosition_ShouldReturnSameNumber() {
        Maximum<Float> maximum = new Maximum<>(3.3f,20.6f,7.8f,1.1f);
        Float result= maximum.maximumValue();
        Assert.assertEquals( (Float)20.6f,result);
    }

    //Test case for Strings
    @Test
    public void givenMaximumStringValue_WhenAtFirstPosition_ShouldReturnSameString() {
        Maximum<String> maximum = new Maximum<>("PLANE","CAR","BIKE");
        String result=maximum.maximumValue();
        Assert.assertEquals("PLANE",result);
    }

    @Test
    public void givenMaximumStringValue_WhenAtSecondPosition_ShouldReturnSameString() {
        Maximum<String> maximum = new Maximum<>("BIKE","PLANE","CAR");
        String result=maximum.maximumValue();
        Assert.assertEquals("PLANE",result);
    }

    @Test
    public void givenMaximumStringValue_WhenAtThirdPosition_ShouldReturnSameString() {
        Maximum<String> maximum = new Maximum<>("BIKE","CAR","PLANE");
        String result=maximum.maximumValue();
        Assert.assertEquals("PLANE",result);
    }

    @Test
    public void givenMaximumStringValue_WhenMaximumAtThirdPosition_ShouldReturnSameString() {
        Maximum<String> maximum = new Maximum<>("BIKE","CAR","TRUCK","PLANE","Bus");
        String result=maximum.maximumValue();
        Assert.assertEquals("TRUCK",result);
    }
}