package org.dexter.openclosed;

public class SubtractOperation implements  Operation {


    @Override
    public int perform(int x, int y) {
        return x-y;
    }
}
