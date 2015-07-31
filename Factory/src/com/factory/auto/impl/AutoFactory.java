package com.factory.auto.impl;

import com.factory.auto.entities.Automobile;
import com.factory.auto.entities.impl.Car;
import com.factory.auto.entities.impl.Truck;

/**
 * Created by will on 7/30/15.
 */
public class AutoFactory {
    public static Automobile getAutomobile(String vehicleType){
        switch(vehicleType.toLowerCase()){
            case "car" : return new Car(4, 2, "v8");
            case "truck" : return new Truck(18, 2, "v12");
            default: return null;
        }
    }
}
