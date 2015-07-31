package com.factory.auto.entities.impl;

import com.factory.auto.entities.Automobile;

/**
 * Created by will on 7/30/15.
 */
public class Truck extends Automobile {
    private int wheels;
    private int doors;
    private String type;
    public Truck(int wheels, int doors, String type){
        this.wheels = wheels;
        this.doors = doors;
        this.type = type;
    }

    @Override
    public int getWheels() {
        return wheels;
    }

    @Override
    public int getDoors() {
        return doors;
    }

    @Override
    public String getEngineType() {
        return type;
    }
}
