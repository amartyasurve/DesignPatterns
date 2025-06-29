package org.example;

import org.example.strategy.SpecialDrive;

public class SportVehicle extends Vehicle{
    SportVehicle() {
        super(new SpecialDrive());
    }
}
