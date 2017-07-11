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
class CountryBook extends PaperBooks
{
    String CountryName;
    String Language;
    
    public CountryBook()
    {
        CountryName="USA";
        Language = "English";
    }
    
    public void CountryDisplay()
    {
        printInfo();
        System.out.println("Region Name "+CountryName);
        System.out.println("Region Name "+Language);
    }
}
