package org.dexter.liskov;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Bicycle();
        vehicle.drive();
        vehicle.park();

        MotorVehicle vehicle1 =  new Car();
        vehicle1.drive();
        vehicle1.startEngine();
        vehicle1.stopEngine();
    }
}
