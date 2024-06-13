package org.dexter.liskov;

public class Bicycle implements Vehicle{


    @Override
    public void drive() {

        System.out.println("Riding bicycle .....");
    }

    @Override
    public void park() {
        System.out.println("Bicycle parked ");

    }
}
