package Worksheet1_2;

public class Cons_Overload {
    String size ;
    double price;
    String name;
    double bargain_price = this.price;
    
    
    //Default Constructor
    Cons_Overload() {
        System.out.println("This is Default Constructor Called.");
    }
    
    //Parameterised Contructor for initialising data members
    Cons_Overload(String size, double price, String name) {
        System.out.println("parameterised constructor called");
        this.name = name;
        this.price = price;
        this.size = size;
    }
    
    //Overloading constructor
    Cons_Overload(double bargain_price) {
        System.out.println("Overloading constructor with change in price and setting it to new price...");
        this.bargain_price = bargain_price;
    }
    
    void displayInfo() {
        System.out.println("Name of the Outfit: "+ name);
        System.out.println("Size : "+ size);
        System.out.println("Original Price : "+ price);
        System.out.println("Price after Bargaining "+ bargain_price);
    }
    
    
}
