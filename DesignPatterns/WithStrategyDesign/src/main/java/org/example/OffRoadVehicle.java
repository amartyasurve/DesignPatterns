package org.example;

import org.example.strategy.SpecialDrive;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle(){
        super(new SpecialDrive());
    }
}
