package com.bridgelabz.maximumtesting;

import com.bridgelabz.maximum.utility.Maximum.Maximum;
import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {

    @Test
    public void givenMaximumNumber_WhenAtFirstPosition_ShouldReturnSameNumber() {
        Maximum maximum = new Maximum();
        int result = maximum.maximumValue(30,20,10);
        Assert.assertEquals(30, result);
    }

    @Test
    public void givenMaximumNumber_WhenASecondPosition_ShouldReturnSameNumber() {
        Maximum maximum = new Maximum();
        Integer result = maximum.maximumValue(30, 40, 10);
        Assert.assertEquals((Integer) 40, result);
    }

    @Test
    public void givenMaximumNumber_WhenAThirdPosition_ShouldReturnSameNumber() {
        Maximum maximum = new Maximum();
        Integer result = maximum.maximumValue(30, 40, 50);
        Assert.assertEquals((Integer) 50, result);
    }

    @Test
    public void givenMaximumFloatNumber_WhenAtFirstPosition_ShouldReturnSameNumber() {
        Maximum maximum = new Maximum();
        Float result= maximum.maximumValue(3.3f,2.2f,1.1f);
        Assert.assertEquals((Float) 3.3f,result);
    }

    @Test
    public void givenMaximumFloatNumber_WhenAtSecondPosition_ShouldReturnSameNumber() {
        Maximum maximum = new Maximum();
        Float result= maximum.maximumValue(3.3f,20.6f,1.1f);
        Assert.assertEquals((Float) 20.6f,result);
    }
    
    @Test
    public void givenMaximumFloatNumber_WhenAtThirdPosition_ShouldReturnSameNumber() {
        Maximum maximum = new Maximum();
        Float result= maximum.maximumValue(3.3f,20.6f,40.1f);
        Assert.assertEquals((Float) 40.1f,result);
    }

    @Test
    public void givenMaximumStringValue_WhenAtFirstPosition_ShouldReturnSameString() {
        Maximum maximum = new Maximum();
        String result=maximum.maximumValue("PLANE","CAR","BIKE");
        Assert.assertEquals("PLANE",result);
    }

    @Test
    public void givenMaximumStringValue_WhenAtSecondPosition_ShouldReturnSameString() {
        Maximum maximum = new Maximum();
        String result=maximum.maximumValue("BIKE","PLANE","CAR");
        Assert.assertEquals("PLANE",result);
    }
    @Test
    public void givenMaximumStringValue_WhenAtThirdPosition_ShouldReturnSameString() {
        Maximum maximum = new Maximum();
        String result=maximum.maximumValue("BIKE","CAR","PLANE");
        Assert.assertEquals("PLANE",result);
    }


}
