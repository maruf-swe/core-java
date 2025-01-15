package javaoop.abstractclasses;

abstract class Animal {
    // Fields
    String name;
    static int count = 0;
    final int legs = 4;

    // Constructor
    public Animal(String name) {
        this.name = name;
        count++;
        System.out.println("Abstract class constructor called.");
    }

    // Abstract method
    abstract void makeSound();

    // Concrete method
    void eat() {
        System.out.println(name + " eats food.");
    }

    // Static method
    static void showCount() {
        System.out.println("Number of animals: " + count);
    }

    // Final method
    final void sleep() {
        System.out.println(name + " sleeps.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name); // Calls the constructor of the abstract class
    }

    @Override
    void makeSound() {
        System.out.println(name + " barks.");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " meows.");
    }
}

public class AbstractClassCompleteExample {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex");
        dog.makeSound();
        dog.eat();
        dog.sleep();

        Cat cat = new Cat("Whiskers");
        cat.makeSound();
        cat.eat();
        cat.sleep();

        Animal.showCount(); // Static method call
    }
}

