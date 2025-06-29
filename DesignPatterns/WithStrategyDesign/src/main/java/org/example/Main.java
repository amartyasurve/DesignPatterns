package org.example;

import org.example.strategy.NormalDrive;

public class Main {
    public static void main(String[] args) {
        System.out.println("start");
        Vehicle vehicle=new PassengerVehicle();
        vehicle.drive();
    }
}