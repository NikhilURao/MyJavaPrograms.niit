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
class PaperBooks extends Books
{
    
    int shippingcharge;
    
    public PaperBooks()
    {
        shippingcharge = 10;
        System.out.println("Child Class Constructor");
    }
    public void printInfo()
    {
        //displayInfo method of Books classis getting reused by PaperBooks class
        displayInfo();
        System.out.println("Shpping Charges are" + shippingcharge);
    }
}
