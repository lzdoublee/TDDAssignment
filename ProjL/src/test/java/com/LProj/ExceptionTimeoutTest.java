package com.LProj;

import org.junit.Test;

/**
 * Created by L.z Double E on 3/19/2017.
 */
public class ExceptionTimeoutTest {

    @Test(timeout = 11)
    public void exceptionTimeoutTest()throws Exception
    {
        while(true)
        {
            System.out.close();
        }
    }
}
