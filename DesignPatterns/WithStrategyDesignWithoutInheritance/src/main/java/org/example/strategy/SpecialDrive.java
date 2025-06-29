package org.example.strategy;

public class SpecialDrive implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("this is a special drive strategy");
    }
}
