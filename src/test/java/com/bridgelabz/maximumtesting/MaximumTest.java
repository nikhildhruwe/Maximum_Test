package com.bridgelabz.maximumtesting;

import com.bridgelabz.maximum.utility.Maximum.Maximum;
import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {

    @Test
    public void givenMaximumNumber_WhenAtFirstPosition_ShouldReturnSameNumber() {
        Maximum maximum = new Maximum();
        int result = maximum.maximumValue(30, 20, 10);
        Assert.assertEquals(30, result);
    }
}
