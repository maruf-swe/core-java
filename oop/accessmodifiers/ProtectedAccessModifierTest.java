package javaoop.accessmodifiers;
/*

Access Hierarchy for protected:
In the same class: Accessible.
In a subclass (in the same package): Accessible.
In a subclass (in a different package): Accessible.
In a non-subclass (in the same package): Accessible.
In a non-subclass (in a different package): Not accessible.

 */
public class ProtectedAccessModifierTest {
    public static void main(String[] args) {
        ProtectedAccessModifierDog dog = new ProtectedAccessModifierDog("Tommy");
        dog.showInfo();
        dog.bark();
        ProtectedAccessModifierAnimal animal = new ProtectedAccessModifierAnimal("Melvin"); // access from same package
        System.out.println(animal.name);
        animal.speak();
    }
}
