package javaoop.accessmodifiers;

class DefaultAccessModifiersAnimal {
    String name;  // Default access

    // Constructor with default access
    DefaultAccessModifiersAnimal(String name) {
        this.name = name;
    }

    // Default access method
    void speak() {
        System.out.println(name + " makes a sound");
    }
}

