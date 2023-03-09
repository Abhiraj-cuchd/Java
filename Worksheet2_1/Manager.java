package Worksheet2_1;

public class Manager extends Employee{
    
    int noOfSubordinates;
    double managerHike;

    public Manager(String name, int age, String dept ,int noOfSubordinates, double managerHikes) {
        super(name, age, dept);
        this.noOfSubordinates = noOfSubordinates; 
        this.managerHike = managerHikes;
    }

    @Override
    public void getDetails() {
        System.out.println("Name of the Manager: "+ name);
        System.out.println("Department Heading: "+ dept);
        System.out.println("Seniority of the Manager: "+age);
        System.out.println("No of Employees Working under the Manager: "+ noOfSubordinates);
    }

    @Override
    public void calculateSal(double netSal) {
        sal = netSal + (0.3 * netSal) + managerHike;
        System.out.println("The Salary of the Manager: "+ sal);
    } 
    
}
