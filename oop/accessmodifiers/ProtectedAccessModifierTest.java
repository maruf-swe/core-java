package javaoop.accessmodifiers;

public class ProtectedAccessModifierTest {
    public static void main(String[] args) {
        ProtectedAccessModifierDog dog = new ProtectedAccessModifierDog("Tommy");
        dog.showInfo();
        dog.bark();
    }
}
