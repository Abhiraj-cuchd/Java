package Worksheet2_2;

public class StaticExample {

    // static variable
    public static int count = 0;
    
    // instance variable
    private int id;

    public StaticExample() {
        // increment count each time an object is created
        count++;
        // assign id to count value
        id = count;
    }

    // static method
    public static int getCount() {
        return count;
    }

    // instance method
    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        // create three StaticExample objects
        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();
        StaticExample obj3 = new StaticExample();

        // print the count value using static method
        System.out.println("Count value: " + StaticExample.getCount());

        // print the id values using instance method
        System.out.println("Obj1 id: " + obj1.getId());
        System.out.println("Obj2 id: " + obj2.getId());
        System.out.println("Obj3 id: " + obj3.getId());
    }
}

