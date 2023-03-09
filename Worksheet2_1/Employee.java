package Worksheet2_1;

public class Employee {
    String name;
    int age;
    String dept;
    double sal;

    public Employee(String name, int age, String dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }
    
    
    public void getDetails() {
        System.out.println("Name of the Employee: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Department of the Employee: "+dept);
    }
    
    public void calculateSal(double netSal) {
        sal = netSal + (0.3 * netSal);
        System.out.println("Salary of the Employee: "+ sal);
    }
}
