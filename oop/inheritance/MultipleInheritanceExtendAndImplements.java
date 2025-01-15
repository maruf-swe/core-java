package javaoop.inheritance;
/*
Multiple Inheritance is a feature of an object-oriented concept, where a class can inherit properties of more than one parent class.
The problem occurs when there exist methods with the same signature in both the superclasses and subclass. On calling the method,
  the compiler cannot determine which class method to be called and even on calling which class method gets the priority.

  However, Java allows multiple inheritance through interfaces. Interfaces provide a way to achieve multiple inheritance
   while avoiding the complexities of the diamond problem, as the implementation must be explicitly defined in the subclass.
 */
class F{
    int a = 5;
    String name = "Maruf";
}
// First Interface
interface Monkey {
    void eat();
}

// Second Interface
interface Parrot {
    void fly();
}

// Implementing Multiple Interfaces
class Pigeon extends F implements Monkey, Parrot {
    @Override
    public void eat() {
        System.out.println("The bat eats insects.");
    }

    @Override
    public void fly() {
        System.out.println("The bat flies in the night.");
    }
}

public class MultipleInheritanceExtendAndImplements {
    public static void main(String[] args) {
        Pigeon pigeon = new Pigeon();
        pigeon.eat(); // Method from Animal
        pigeon.fly(); // Method from Bird
        System.out.println(pigeon.name);
    }
}
