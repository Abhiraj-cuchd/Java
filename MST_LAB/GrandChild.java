package MST_LAB;

public class GrandChild extends Child {
    
    public GrandChild(String name, int age, double income, double assets, String childName, int childAge, double assetShare) {
        super(name,  age, income,  assets,  childName,  childAge, assetShare);
    }
    
    void showInfo() {
        System.out.println("Father Name: "+ childName);
        System.out.println("GrandFather Name: "+ name);
        System.out.println("Share of Assets: "+ (assets+40));
    }
    
}
