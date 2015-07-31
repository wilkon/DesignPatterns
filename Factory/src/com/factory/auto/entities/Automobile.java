package com.factory.auto.entities;

/**
 * Created by will on 7/30/15.
 */
public abstract class Automobile {
    public abstract int getWheels();
    public abstract int getDoors();
    public abstract String getEngineType();
    public String toString(){
        return "Wheels: " + getWheels() + ", Doors: "+ getDoors() + ", Engine: " + getEngineType();
    }
}
