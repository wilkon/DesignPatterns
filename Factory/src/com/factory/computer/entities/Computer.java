package com.factory.computer.entities;

/**
 * Created by will on 7/28/15.
 */
public abstract class Computer {
    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    public String toString(){
        return "RAM = " + this.getRAM() + ", HDD = " + this.getHDD() + ", CPU = " + this.getCPU();
    }
}
