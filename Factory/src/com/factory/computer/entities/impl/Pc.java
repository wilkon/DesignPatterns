package com.factory.computer.entities.impl;

import com.factory.computer.entities.Computer;

/**
 * Created by will on 7/28/15.
 */
public class Pc extends Computer {
    private String RAM;
    private String HDD;
    private String CPU;

    public Pc(String ram, String cpu, String hdd){
        this.RAM = ram;
        this.CPU = cpu;
        this.HDD = hdd;
    }
    @Override
    public String getRAM(){
        return this.RAM;
    }
    @Override
    public String getCPU(){
        return this.CPU;
    }
    @Override
    public String getHDD(){
        return this.HDD;
    }
}
