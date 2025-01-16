package javaoop.interfaces;

interface Animal1 {
    void sound();  // Abstract method

    default void eat() {
        System.out.println("This animal eats food.");
    }

    static void info() {
        System.out.println("Animals are living creatures.");
    }
}

class Dog implements Animal1 {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    // override the interface default method
    @Override
    public void eat(){
        System.out.println("Dogs are eat Food");
    }
}

class Cat implements Animal1 {

    @Override
    public void sound() {
        System.out.println("Cat Meow");
    }
}

public class DefaultAndStaticMethod  {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound();
        d1.eat();

        Cat c1 = new Cat();
        c1.eat();

    }
}
