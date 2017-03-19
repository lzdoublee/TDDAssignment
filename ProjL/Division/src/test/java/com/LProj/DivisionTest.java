package com.LProj;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by L.z Double E on 3/19/2017.
 */
public class DivisionTest {
    Division divide = new Division();

    @Test
    public void divTest() throws Exception
    {
        int div = divide.division(10, 2);
        Assert.assertEquals(5, div);
    }
}
