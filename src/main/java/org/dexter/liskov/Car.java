package org.dexter.liskov;

public class Car implements MotorVehicle {
    @Override
    public void startEngine() {
        System.out.println("Car started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car stopped");
    }

    @Override
    public void drive() {

        System.out.println("Car driving");

    }

    @Override
    public void park() {
        System.out.println("Car parked");

    }
}
