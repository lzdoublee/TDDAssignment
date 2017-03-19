package com.LProj;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by L.z Double E on 3/19/2017.
 */
public class FailTest {
    @Test
    public  void failTest() throws Exception
    {
        Assert.assertTrue(!true);
        Assert.assertFalse(5>4);
    }
}
