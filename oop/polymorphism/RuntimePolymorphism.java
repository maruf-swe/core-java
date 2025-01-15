package javaoop.polymorphism;

class Vehicle {
    void sound() {
        System.out.println("Vehicle makes a sound");
    }
}

class Car extends Vehicle {
    // Overriding sound() method
    @Override
    void sound() {
        System.out.println("Car honks");
    }
}

class Bike extends Vehicle {
    // Overriding sound() method
    @Override
    void sound() {
        System.out.println("Bike revs");
    }
}

class RuntimePolymorphism {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car();
        Vehicle vehicle2 = new Bike();

        vehicle1.sound();  // Output: Car honks
        vehicle2.sound();  // Output: Bike revs
    }
}
