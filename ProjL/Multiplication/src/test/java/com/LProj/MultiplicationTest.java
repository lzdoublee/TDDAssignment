package com.LProj;

import org.junit.Assert;
import org.junit.*;

/**
 * Created by L.z Double E on 3/19/2017.
 */
public class MultiplicationTest {
    Multiplication mult = new Multiplication();

    @Test
    public void multTest() throws Exception
    {
        int prod = mult.mult(5, 2);
        Assert.assertEquals(10, prod);
    }
}
