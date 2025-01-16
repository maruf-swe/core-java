package javaoop.interfaces;

interface Animal {
    void makeSound();

    void eat();

    int legs = 2;
}

class Birds implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Birds can Sound");
    }

    @Override
    public void eat() {
        System.out.println("Birds Can Eat");
    }

    void showLegs() {
        System.out.println("Birds has " + legs + " legs");
    }
}

public class InterfaceSimpleExample {
    public static void main(String[] args) {
        Birds birds = new Birds();
        birds.eat();
        birds.makeSound();
        birds.showLegs();
    }
}
