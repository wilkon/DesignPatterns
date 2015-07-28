package com.factory.impl;

import com.factory.entities.Computer;
import com.factory.entities.impl.Pc;
import com.factory.entities.impl.Server;

/**
 * Created by will on 7/28/15.
 */
public class ComputerFactory {
    public Computer getComputer(String type){
        if(type.equals("pc"))
            return new Pc("16gig", "i7");
        else if(type.equals("server"))
            return new Server("100Gig", "j4");
        else return null;
    }
}
