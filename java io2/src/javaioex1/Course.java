/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaioex1;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author slt
 */
public class Course implements Serializable
{
    String CrsName;
    List<Student> stdDetails;
    
    public String getCrsName()
    {
        return CrsName;
    }
    public void setCrsName(String CrsName)
    {
        this.CrsName=CrsName;
    }
    public List<Student> getstdDetails()
    {
        return stdDetails;
    }
    public void setStdDetails(List<Student> stdDetails)
    {
        this.stdDetails=stdDetails;
    }
}
