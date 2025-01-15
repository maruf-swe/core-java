package javaoop.inheritance;
/*

 */
class Animal1 {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Intermediate Class
class Mammal extends Animal {
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
        dog.eat();  // Method from Animal
        dog.walk(); // Method from Mammal
        dog.bark(); // Method from Dog
    }
}
