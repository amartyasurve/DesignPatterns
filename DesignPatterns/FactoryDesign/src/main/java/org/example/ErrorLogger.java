package org.example;

public class ErrorLogger implements ILogger{
    @Override
    public void log() {
        System.out.println("logger from ErrorLogger");
    }
}
