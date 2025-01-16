package javaoop.interfaces;

interface Vehicle {
    void start();

    void stop();
}

class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car Engine Start");
    }

    @Override
    public void stop() {
        System.out.println("Car Engine Stop");
    }
}

class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bike Engine Start");
    }

    @Override
    public void stop() {
        System.out.println("Bike Engine Stop");
    }
}

class Bus implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bus Engine Start");
    }

    @Override
    public void stop() {
        System.out.println("Bus Engine Stop");
    }
}

class ControllerVehicle {
    public void controllerVehicleMethod(Vehicle vehicle){
        vehicle.start();
        vehicle.stop();
    }
}
public class PolymorphismWithInterface {
    public static void main(String[] args) {
        ControllerVehicle controllerVehicle = new ControllerVehicle();

        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle bus = new Bus();
        controllerVehicle.controllerVehicleMethod(car);
        controllerVehicle.controllerVehicleMethod(bike);
        controllerVehicle.controllerVehicleMethod(bus);

    }
}
