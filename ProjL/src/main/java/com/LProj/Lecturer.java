package com.LProj;

/**
 * Created by L.z Double E on 3/19/2017.
 */
public class Lecturer {
    String lastName;
    String dep;
    public Lecturer(String ln, String d)
    {
        lastName = ln;
        dep = d;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getDep()
    {
        return dep;
    }
}