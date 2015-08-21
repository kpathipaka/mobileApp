package com.bpatech.mapbpa;

/**
 * Created by kiran on 20-08-2015.
 */
public class LocationObject {
    LocationObject(double value1, double value2){
        this.value1 = value1;
        this.value2 = value2;
    }
    public Double getValue2() {
        return value2;
    }

    public void setValue2(Double value2) {
        this.value2 = value2;
    }

    public Double getValue1() {
        return value1;
    }

    public void setValue1(Double value1) {
        this.value1 = value1;
    }

    Double value1;
    Double value2;
}
