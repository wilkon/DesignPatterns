package com.factory.computer.impl;

import com.factory.computer.entities.impl.Pc;
import com.factory.computer.entities.impl.Server;
import com.factory.computer.entities.Computer;

/**
 * Created by will on 7/28/15.
 */
public class ComputerFactory {
    public Computer getComputer(String type) {
        switch (type.toLowerCase()){
            case "pc":
                return new Pc("16gig", "i7", "500gigs");
            case "server":
                return new Server("100Gig", "j4", "500tera");
            default: return null;
        }
    }
}
