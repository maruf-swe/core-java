package javaoop.inheritance;

/*
Multilevel inheritance in Java refers to a scenario where a class is derived from another derived class.
 In other words, the inheritance chain extends beyond one level, forming a hierarchy of classes. This allows
  properties and methods from the top-level superclass to be inherited by all the subclasses in the chain.

Key Concepts
Superclass: The topmost class in the hierarchy.
Intermediate Class: A class that inherits from a superclass and serves as the base class for another class.
Subclass: The class at the lowest level in the hierarchy.
 */
class AnimalParentClass1 {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Intermediate Class
class Mammal extends AnimalParentClass1 {
    void walk() {
        System.out.println("This mammal walks on land.");
    }
}

// Subclass
class Dog1 extends Mammal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Dog1 dog = new Dog1();

        // Accessing methods from all levels of inheritance
        dog.eat();  // Method from AnimalParentClass
        dog.walk(); // Method from Mammal
        dog.bark(); // Method from Dog2
    }
}
