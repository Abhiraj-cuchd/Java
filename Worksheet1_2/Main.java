package Worksheet1_2;

public class Main {
    public static void main(String[] args) {
        
        //Creating Object with the Default Constructor
        Cons_Overload overload = new Cons_Overload();
        
        //Creating Object with parameterised Constructor
        Cons_Overload overload1 = new Cons_Overload("XL", 699, "Kurta Salwar");
        overload1.displayInfo();
        
        //Creating object with overloaded constructor for bargaining price
        Cons_Overload overload2 = new Cons_Overload(599);
        overload2.displayInfo();
    }
    
    
    
}
