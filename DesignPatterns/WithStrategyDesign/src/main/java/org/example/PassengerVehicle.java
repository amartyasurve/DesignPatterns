package org.example;

import org.example.strategy.NormalDrive;

public class PassengerVehicle extends Vehicle{
    PassengerVehicle(){
        super(new NormalDrive());
    }
}
