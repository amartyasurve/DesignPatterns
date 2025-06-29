package org.example;

import org.example.strategy.NormalDrive;
import org.example.strategy.SpecialDrive;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is the composition implementation of Strategy");

        /*
        DI : Dependency Injection
        this is used for loose coupling

        in the below examples
        OffRoadVehicle --> this is implemented without DI
        SportVehicle --> implemented using DI
        */
        OffRoadVehicle offRoadVehicle=new OffRoadVehicle();//this has implemented without using DI
        offRoadVehicle.drive();

        SportVehicle sportVehicle=new SportVehicle(new Vehicle(new SpecialDrive()));
        sportVehicle.drive();

        PassengerVehicle passengerVehicle=new PassengerVehicle(new Vehicle(new NormalDrive()));
        passengerVehicle.drive();
    }
}