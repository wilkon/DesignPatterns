package com.factory.impl;

import com.factory.entities.Computer;
import com.factory.entities.impl.Pc;
import com.factory.entities.impl.Server;

/**
 * Created by will on 7/28/15.
 */
public class ComputerFactory {
    public Computer getComputer(String type) {
        switch (type){
            case "pc":
                return new Pc("16gig", "i7", "500gigs");
            case "server":
                return new Server("100Gig", "j4", "500tera");
            default: return null;
        }
    }
}
