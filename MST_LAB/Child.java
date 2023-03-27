package MST_LAB;

public class Child extends Parent {
    
    String childName; int childAge; double assetShare;

    public Child(String name, int age, double income, double assets, String childName, int childAge, double assetShare) {
        super(name, age, income, assets);
        this.childName = childName;
        this.childAge = childAge;
        this.assetShare = assetShare;
    }
    
    public void displayInfo() {
        System.out.println("Asset Share of Parent: "+ (assets/assetShare));
        System.out.println("Father Name: "+ name);
    }
    
}
