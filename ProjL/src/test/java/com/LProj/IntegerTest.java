package com.LProj;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by L.z Double E on 3/19/2017.
 */
public class IntegerTest {

    Integers tot = new Integers();

    @Test
    public void numberTest() throws Exception
    {
        int res = tot.checkIntegers(3, 5);
        Assert.assertEquals(8, res);
    }
}
