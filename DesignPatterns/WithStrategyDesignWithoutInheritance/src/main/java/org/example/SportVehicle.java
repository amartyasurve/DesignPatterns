package org.example;

public class SportVehicle {
    Vehicle vehicle;
    SportVehicle(Vehicle vehicle){
        this.vehicle=vehicle;
    }
    void drive(){
        vehicle.drive();
    }
}
