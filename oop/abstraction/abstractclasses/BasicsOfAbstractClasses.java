package javaoop.abstractclasses;

public class BasicsOfAbstractClasses {
    /*


                            What Abstract Classes Are:::
An abstract class in Java is a class declared with the abstract keyword. It can:
* Define a blueprint for subclasses.
* Have methods that are both abstract (no implementation) and concrete (fully implemented).
* Serve as a parent class, providing shared functionality to subclasses.
** You cannot instantiate an abstract class directly, but you can create objects of its concrete subclasses.

                    What Abstract Classes Allow :::

      1. Fields (Variables)
Instance Variables: Can store data specific to each object.
Static Variables: Shared among all objects of the class.
Final Variables: Constants that cannot be changed.

abstract class FieldsExample {
    int instanceVariable = 10;       // Instance variable
    static String staticVariable = "Shared Data"; // Static variable
    final int constantValue = 100;  // Final variable
}

      2. Methods
Abstract Methods: Declared without a body and must be implemented in subclasses.
Concrete Methods: Fully implemented methods that can be inherited or overridden.
Static Methods: Associated with the class and can be called without creating an object.
Final Methods: Cannot be overridden in subclasses.

abstract class MethodsExample {
    // Abstract method (no implementation)
    abstract void abstractMethod();

    // Concrete method
    void concreteMethod() {
        System.out.println("This is a concrete method.");
    }

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Final method
    final void finalMethod() {
        System.out.println("This is a final method.");
    }
}

       3. Constructors
Abstract classes can have constructors, including parameterized ones.
These constructors are called when a subclass object is created.
abstract class ConstructorsExample {
    Example() {

    }
}
class Subclass extends Example {
    Subclass() {
        super();
    }
}

       4. Access Modifiers:
Fields and methods in abstract classes can have any access modifier:
private
protected
public
default (package-private)

abstract class Animal {
    private int age;          // Private field
    protected String type;    // Protected field
    public String name;       // Public field

    protected abstract void makeSound(); // Protected abstract method
}

       5. Inheritance:
Abstract classes support single inheritance.
A subclass can extend only one abstract class.
A subclass must implement all abstract methods or declare itself as abstract.

                        What Abstract Classes Do NOT Allow:::

        1.Instantiation:
You cannot create an object of an abstract class using the new keyword.

abstract class Animal {}

public class Main {
    public static void main(String[] args) {
        // This will cause a compilation error:
        // Animal animal = new Animal();
    }
}

        2. Private Abstract Methods:
Abstract methods cannot be private, as they need to be accessible to subclasses for overriding.

        3. Final Abstract Methods:
An abstract method cannot be final, as final methods cannot be overridden.

     */
}
