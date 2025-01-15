package javaoop.inheritance;

// base class
class Bicycle {
    // the Bicycle class has two fields
    public int gear;
    public int speed;
    public String name = "Maruf";

    // the Bicycle class has one constructor
    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    // the Bicycle class has three methods
    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    // toString() method to print info of Bicycle
    public String toString() {
        return ("No of gears are " + this.gear + "\n"
                + "speed of bicycle is " + this.speed);
    }
}

// derived class
class MountainBike extends Bicycle {

    // the MountainBike subclass adds one more field
    public int seatHeight;

    // the MountainBike subclass has one constructor
    public MountainBike(int gear, int speed,
                        int startHeight) {
        // invoking base-class(Bicycle) constructor
        super(gear, speed);
        seatHeight = startHeight;   // Store the extra values in the Child class
    }

    // the MountainBike subclass adds one more method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    // overriding toString() method
    // of Bicycle to print more info
    @Override
    public String toString() {
        return (super.toString() + "\nseat height is "
                + seatHeight);
    }
}

// driver class
public class InheritanceExample {
    public static void main(String args[]) {

        MountainBike mb = new MountainBike(3, 100, 25);

        System.out.println(mb.toString());
        System.out.println(mb.name); // access parent class variable
    }
}