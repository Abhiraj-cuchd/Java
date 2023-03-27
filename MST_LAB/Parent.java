package MST_LAB;

public class Parent {
    String name;
    int age;
    double income;
    double assets;

    public Parent(String name, int age, double income, double assets) {
        this.name = name;
        this.age = age;
        this.income = income;
        this.assets = assets;
    }
    
    void DisplayInfo() {
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Income: " + income);
        System.out.println("Assets of the Program: "+ assets);
    }
    
    
}
