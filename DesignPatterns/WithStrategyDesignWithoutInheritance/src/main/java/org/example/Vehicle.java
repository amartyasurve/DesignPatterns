package org.example;

import org.example.strategy.DriveStrategy;

public class Vehicle{
    //create a has a relationship with an interface
   DriveStrategy driveStrategy;//has-a

   Vehicle(DriveStrategy driveStrategy){
       this.driveStrategy=driveStrategy;
   }

   public void drive(){
       driveStrategy.drive();
   }

}
