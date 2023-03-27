package Worksheet2_2;

public class Main {
    public static void main(String[] args) {
        Example example1 = new Example(1);
        Example example2 = new Example(2);

        example1.instanceMethod(); // prints "Instance variable: 1" and "Static variable: 0"
        example2.instanceMethod(); // prints "Instance variable: 2" and "Static variable: 0"

        Example.staticVar = 5;
        example1.instanceMethod(); // prints "Instance variable: 1" and "Static variable: 5"
        example2.instanceMethod(); // prints "Instance variable: 2" and "Static variable: 5"

        Example.staticMethod(); // prints "Static variable: 5"
    }
}
