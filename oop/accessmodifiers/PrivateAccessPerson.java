package javaoop.accessmodifiers;

public class PrivateAccessPerson {
    // Private fields (cannot be accessed directly outside the class)
    private String name;
    private int age;

    // Constructor
    public PrivateAccessPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public method to access the private field 'name'
    public String getName() {
        return name;
    }

    // Public method to set the private field 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Public method to access the private field 'age'
    public int getAge() {
        return age;
    }

    // Public method to set the private field 'age'
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    // Private method (cannot be accessed outside the class)
    private void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public void displayDetails() {
        printDetails();  // Allowed within the class
    }
}
