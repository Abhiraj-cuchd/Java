package Worksheet2_1;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Output Before Inheritance: ");
        System.out.println();
        // Calling Employee Class First
        Employee emp = new Employee("Sachin Kumar", 23, "Admin");
        emp.getDetails();
        emp.calculateSal(25000);
        
        System.out.println();
        System.out.println("Output After Inheritance:  ");
        System.out.println();
        //Now Calling Manager Class Showing Inheritance
        Manager M1 = new Manager("Abhiraj Ghosh", 36, "IT", 20, 25000);
        
        M1.getDetails();
        M1.calculateSal(50000);
    }
}
