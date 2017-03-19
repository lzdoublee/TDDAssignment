package com.LProj;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by L.z Double E on 3/19/2017.
 */
public class ObjectIdentityTest {

    private Lecturer lec;
    private Student acc;
    private Student omt;

    @Before
    public void details() throws Exception
    {
     lec = new Lecturer("Rothman","IT");
     acc = new Student("Khayalethu","Accountancy");
     omt = new Student("Ruuva","OMT");
    }

    @Test
    public void objectIdentityTest() throws Exception
    {
        Assert.assertSame(acc,acc);
        Assert.assertNotSame(omt, lec);
    }
}
