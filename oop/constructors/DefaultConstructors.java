package javaoop.constructors;

class Default {

    int id;       // Instance variable
    String name;  // Instance variable

    // Default constructor
    Default() {
        id = 0;
        name = "Unknown";
        System.out.println("Default Constructor Called!");
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class DefaultConstructors {
    public static void main(String[] args) {
        // Create an object of the class
        Default obj = new Default();
        obj.display(); // Outputs: ID: 0, Name: Unknown
    }
}
