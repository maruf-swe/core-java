package javaoop.interfaces;

interface Animal2 {
    // Abstract method
    void sound();

    // Default method
    default void eat() {
        System.out.println("Eating...");
        digestionProcess();  // Calling private method
    }

    // Another default method
    default void sleep() {
        System.out.println("Sleeping...");
        digestionProcess();  // Reusing the private method
    }

    // Private method (only accessible within the interface)
    private void digestionProcess() {
        System.out.println("Digesting food...");
    }
}

class Dog2 implements Animal2 {
    @Override
    public void sound() {
        System.out.println("Dog2 barks");
    }
}

public class PrivateMethodInterface {
    public static void main(String[] args) {
        Dog2 dog = new Dog2();
        dog.sound();
        dog.eat();
        dog.sleep();
    }
}

