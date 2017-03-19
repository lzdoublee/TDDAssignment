package com.LProj;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by L.z Double E on 3/19/2017.
 */
public class NullnessTest {

    private Student acc;

    @Before
    public void details() throws Exception
    {
        acc = new Student("Khayalethu","Accountancy");
    }

    @Test
    public void nullnessTest() throws Exception
    {
        acc = null;
        Assert.assertNull(acc);
    }
}
