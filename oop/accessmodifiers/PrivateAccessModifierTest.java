package javaoop.accessmodifiers;

public class PrivateAccessModifierTest {
    public static void main(String[] args) {
        PrivateAccessPerson person = new PrivateAccessPerson("Alice", 30);

        // Accessing private fields through public getter methods
        System.out.println(person.getName());
        System.out.println(person.getAge());

        // Modifying private fields through public setter methods
        person.setName("Bob");
        person.setAge(25);
        System.out.println(person.getName());
        System.out.println(person.getAge());

        // Cannot access private method 'printDetails' outside the class
        // person.printDetails();  // Error: printDetails() has private access in PrivateAccessPerson

        // Calling public method to access private functionality
        person.displayDetails();  // Output: Name: Bob, Age: 25
    }
}
