package Worksheet2_2;

public class Example {
    // instance variable
     int instanceVar;
    
    // static variable
     static int staticVar;

    // constructor
    public Example(int instanceVar) {
        this.instanceVar = instanceVar;
    }

    // instance method
    public void instanceMethod() {
        System.out.println("Instance variable: " + instanceVar);
        System.out.println("Static variable: " + staticVar);
    }

    // static method
    public static void staticMethod() {
        // cannot access instanceVar from a static context
        // System.out.println(instanceVar);

        System.out.println("Static variable: " + staticVar);
    }
}
