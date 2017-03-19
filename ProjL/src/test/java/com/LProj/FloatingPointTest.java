package com.LProj;

import org.junit.Assert;
import org.junit.*;

/**
 * Created by L.z Double E on 3/19/2017.
 */
public class FloatingPointTest {
    FloatingPoints fPoint = new FloatingPoints();

    @Test
    public void FloatingTest() throws Exception
    {
        float res = fPoint.checkFloat(400.0f,20.2f);
        Assert.assertEquals(420.2f,res,0.0f);
    }
}
