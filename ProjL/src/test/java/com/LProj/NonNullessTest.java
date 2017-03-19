package com.LProj;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by L.z Double E on 3/19/2017.
 */
public class NonNullessTest {

    private Lecturer lec;

    @Before
    public void det() throws Exception
    {
        lec = new Lecturer("Rothman", "I.T");
    }

    @Test

    public void nonNullnessTest() throws Exception
    {
        Assert.assertNotNull(lec);
    }

}
