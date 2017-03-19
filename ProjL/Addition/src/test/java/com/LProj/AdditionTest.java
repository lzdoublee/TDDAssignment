package com.LProj;

import org.junit.Assert;
import org.junit.*;

/**
 * Created by L.z Double E on 2017-03-19.
 */
public class AdditionTest {

    Addition add = new Addition();

    @Test
    public void testAdd() throws Exception {
        int sum = add.add(3, 7);
        Assert.assertEquals(10, sum);
    }
}
