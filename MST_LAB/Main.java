package MST_LAB;

public class Main {
    public static void main(String[] args) {
        
        Parent Ramesh = new Parent("Ramesh", 57, 12000, 200000 );
        
        System.out.println("Parent Information: ");
        Ramesh.DisplayInfo();
        
        System.out.println();
        
        Child Karan = new Child("Ramesh", 57, 12000, 20000, "Karan", 33, 45);
        System.out.println("Child Information: ");
       
        Karan.displayInfo();
        
        System.out.println();
        System.out.println("GrandChild Information: ");
        
        GrandChild Rohan = new GrandChild("Ramesh", 57, 12000, 20000, "Karan", 33, 45);
        Rohan.showInfo();
    }
}
