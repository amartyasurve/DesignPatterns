package org.example;

import org.example.strategy.NormalDrive;

public class PassengerVehicle{
    Vehicle vehicle;
    PassengerVehicle(Vehicle vehicle){
        this.vehicle=vehicle;
    }
    void drive(){
        vehicle.drive();
    }
}
