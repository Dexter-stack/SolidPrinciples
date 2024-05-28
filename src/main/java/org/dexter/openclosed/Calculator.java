package org.dexter.openclosed;

public class Calculator {
    public int calculateNumber(int x, int y, Operation operation){
        return operation.perform(x,y);
    }
}
