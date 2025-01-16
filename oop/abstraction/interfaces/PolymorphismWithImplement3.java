package javaoop.interfaces;

interface Vehicle3 {
    void start();

    void stop();
}

class Car3 implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car Engine Start");
    }

    @Override
    public void stop() {
        System.out.println("Car Engine Stop");
    }
}

class Bike3 implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bike Engine Start");
    }

    @Override
    public void stop() {
        System.out.println("Bike Engine Stop");
    }
}

class Bus3 implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bus Engine Start");
    }

    @Override
    public void stop() {
        System.out.println("Bus Engine Stop");
    }
}


public class PolymorphismWithImplement3 {
    public static void main(String[] args) {
        //ControllerVehicle controllerVehicle = new ControllerVehicle();

        Vehicle car = new Car(); // Reference points to Car object
        car.start();
        car.stop();

        Vehicle bike = new Bike(); // Reference points to Bike object
        bike.start();
        bike.stop();
        Vehicle bus = new Bus(); // Reference points to Bus object
        bus.start();
        bus.stop();

        //controllerVehicle.controllerVehicleMethod(car);
        //controllerVehicle.controllerVehicleMethod(bike);
        //controllerVehicle.controllerVehicleMethod(bus);

    }
}
