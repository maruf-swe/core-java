package javaoop.constructors;

class ParameterizedConstructorExample {
    int id;       // Instance variable
    String name;  // Instance variable

    // Parameterized constructor
    ParameterizedConstructorExample(int id, String name) {
        this.id = id;       // Use 'this' to refer to instance variables
        this.name = name;
        System.out.println("Parameterized Constructor Called!");
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        // Create objects with different initial values
        ParameterizedConstructorExample obj1 = new ParameterizedConstructorExample(101, "Alice");
        ParameterizedConstructorExample obj2 = new ParameterizedConstructorExample(102, "Bob");

        obj1.display(); // Outputs: ID: 101, Name: Alice
        obj2.display(); // Outputs: ID: 102, Name: Bob


    }
}

