package javaoop.inheritance;

/*

Hierarchical inheritance in Java occurs when multiple classes inherit from a single superclass. Each subclass has its
  own properties and methods in addition to inheriting common features from the parent class.

This type of inheritance is useful when you want to share common functionality across multiple classes while
  allowing each subclass to have its own unique behavior.
 */

// Superclass
class AnimalParentClass {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass 1
class Dog2 extends AnimalParentClass {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Subclass 2
class Cat extends AnimalParentClass {
    void meow() {
        System.out.println("The cat meows.");
    }
}

// Subclass 3
class Bird extends AnimalParentClass {
    void fly() {
        System.out.println("The bird flies.");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        // Creating objects of each subclass
        Dog2 dog = new Dog2();
        Cat cat = new Cat();
        Bird bird = new Bird();

        // Accessing methods
        dog.eat(); // Method from superclass
        dog.bark(); // Method from Dog2

        cat.eat(); // Method from superclass
        cat.meow(); // Method from Cat

        bird.eat(); // Method from superclass
        bird.fly(); // Method from Bird
    }
}
