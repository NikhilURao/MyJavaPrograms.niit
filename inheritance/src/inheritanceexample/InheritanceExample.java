/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceexample;

/**
 *
 * @author Admin
 */

//Super/Base class

//Child Class


public class InheritanceExample 
{
    public static void main(String[] args) 
    {
        Books pobj = new Books();
        pobj.displayInfo();
        
        RegionalBook robj = new RegionalBook();
        robj.Display();
        
        CountryBook cobj = new CountryBook();
        cobj.CountryDisplay();
    }
}





