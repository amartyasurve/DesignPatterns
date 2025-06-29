package org.example;

import org.example.strategy.SpecialDrive;

public class OffRoadVehicle{
    Vehicle vehicle;
    OffRoadVehicle(){
        this.vehicle=new Vehicle(new SpecialDrive());
    }
    void drive(){
        vehicle.drive();
    }
}
