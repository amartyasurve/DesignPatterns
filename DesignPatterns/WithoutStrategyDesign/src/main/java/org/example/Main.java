package org.example;
public class Main {
    public static void main(String[] args) {
        System.out.println("strategy design pattern");
        Vehicle vehicle=new PassengerVehicle();
        vehicle.drive();
    }
}