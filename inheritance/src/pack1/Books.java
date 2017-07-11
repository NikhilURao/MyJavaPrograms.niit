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
class Books
{
    int pageno;
    String AuthorName,Name;
    float price;
    
    public Books()
    {
        pageno=50;
        AuthorName="David";
        Name ="I Love Java";
        price = 15.88f;
        System.out.println("Base class constructor");
    }
    
    public void displayInfo()
    {
        System.out.println("The Name of Book Is "+Name);
        System.out.println("The Price of Book Is "+price);
        System.out.println("The Number of Pages inside Book Is "+pageno);
        System.out.println("The Author of Book Is "+AuthorName);
    }
}

