package com.LProj;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by L.z Double E on 3/19/2017.
 */
public class ObjectEqualityTest {
    private Student acc;

    @Before
    public void details() throws Exception {
        acc = new Student("Khayalethu", "Accountancy");
    }

    @Test
    public void objectEqualityTest() throws Exception
    {
        Assert.assertEquals(acc,acc);
    }

}
