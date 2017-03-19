package com.LProj;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by L.z Double E on 3/19/2017.
 */
public class ArraysContentTest {
    @Test
    public void arrayContentTest() throws Exception {

        ArrayList<String> alist = new ArrayList<String>();

        for (int count = 0; count < alist.size(); count++) {
            Assert.assertNull(alist.indexOf(count));
        }
    }
}
