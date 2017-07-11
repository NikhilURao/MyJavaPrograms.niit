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
class RegionalBook extends PaperBooks
{
    String RegionName;
    String Language;
    
    public RegionalBook()
    {
        RegionName="East Region";
        Language = "Bangla";
    }
    
    public void Display()
    {
        printInfo();
        System.out.println("Region Name "+RegionName);
        System.out.println("Region Name "+Language);
    }
}
