package org.example.strategy;

public class NormalDrive implements DriveStrategy{
    @Override
    public void drive(){
        System.out.println("this is a normal drive strategy");
    }
}
