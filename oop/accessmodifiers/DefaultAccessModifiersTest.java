package javaoop.accessmodifiers;
/*
Rules for Default Access:
Same Package: Members with default access can be accessed by any class in the same package.
Different Package: Members with default access cannot be accessed by classes in different packages, even if they are subclasses.
 */

class DefaultAccessModifiersTest {
    public static void main(String[] args) {
        DefaultAccessModifiersAnimal animal = new DefaultAccessModifiersAnimal("Lion");
        System.out.println(animal.name);
        animal.speak();

    }
}
