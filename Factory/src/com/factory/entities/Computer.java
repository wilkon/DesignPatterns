package com.factory.entities;

/**
 * Created by will on 7/28/15.
 */
public abstract class Computer {
    private String ram;
    private String cpu;
    public Computer(String ram, String cpu){
        this.ram = ram;
        this.cpu = cpu;
    }
}
