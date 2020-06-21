package com.bridgelabz.maximumtesting;

import com.bridgelabz.maximum.utility.Maximum;
import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {

    @Test
    public void givenMaximumNumber_WhenAtFirstPosition_ShouldReturnSameNumber() {
        Maximum maximum = new Maximum(30,20,10);
        Comparable result = maximum.maximumValue();
        Assert.assertEquals(30, result);
    }

    @Test
    public void givenMaximumNumber_WhenASecondPosition_ShouldReturnSameNumber() {
        Maximum maximum = new Maximum(30, 40, 10);
        Comparable result = maximum.maximumValue();
        Assert.assertEquals( 40, result);
    }

    @Test
    public void givenMaximumNumber_WhenAThirdPosition_ShouldReturnSameNumber() {
        Maximum maximum = new Maximum(30, 40, 50);
        Comparable result = maximum.maximumValue();
        Assert.assertEquals( 50, result);
    }

    @Test
    public void givenMaximumFloatNumber_WhenAtFirstPosition_ShouldReturnSameNumber() {
        Maximum maximum = new Maximum(3.3f,2.2f,1.1f);
        Comparable result= maximum.maximumValue();
        Assert.assertEquals( 3.3f,result);
    }

    @Test
    public void givenMaximumFloatNumber_WhenAtSecondPosition_ShouldReturnSameNumber() {
        Maximum maximum = new Maximum(3.3f,20.6f,1.1f);
        Comparable result= maximum.maximumValue();
        Assert.assertEquals( 20.6f,result);
    }
    
    @Test
    public void givenMaximumFloatNumber_WhenAtThirdPosition_ShouldReturnSameNumber() {
        Maximum maximum = new Maximum(3.3f,20.6f,40.1f);
        Comparable result= maximum.maximumValue();
        Assert.assertEquals( 40.1f,result);
    }

    @Test
    public void givenMaximumStringValue_WhenAtFirstPosition_ShouldReturnSameString() {
        Maximum maximum = new Maximum("PLANE","CAR","BIKE");
        Comparable result=maximum.maximumValue();
        Assert.assertEquals("PLANE",result);
    }

    @Test
    public void givenMaximumStringValue_WhenAtSecondPosition_ShouldReturnSameString() {
        Maximum maximum = new Maximum("BIKE","PLANE","CAR");
        Comparable result=maximum.maximumValue();
        Assert.assertEquals("PLANE",result);
    }
    @Test
    public void givenMaximumStringValue_WhenAtThirdPosition_ShouldReturnSameString() {
        Maximum maximum = new Maximum("BIKE","CAR","PLANE");
        Comparable result=maximum.maximumValue();
        Assert.assertEquals("PLANE",result);
    }
}
