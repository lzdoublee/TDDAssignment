package com.LProj;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by L.z Double E on 3/19/2017.
 */
public class SubtractionTest {
    Subtraction sub = new Subtraction();

    @Test
    public void subTest() throws Exception {
        int diff = sub.sub(10, 7);
        Assert.assertEquals(3, diff);

    }
}
