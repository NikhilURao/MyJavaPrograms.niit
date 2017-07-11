/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaioex1;

import java.io.Serializable;

/**
 *
 * @author slt
 */
public class Student implements Serializable 
{
    private String StdName;
    private int StdAge;
    
    public String getStdName()
    {
        return StdName;
    }
    public void setStdName(String StdName)
    {
        this.StdName=StdName;
    }
    public int getStdAge()
    {
        return StdAge;
    }
    public void setStdAge(int StdAge)
    {
        this.StdAge=StdAge;
    }
}
