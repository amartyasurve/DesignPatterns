package org.example;

public class DebugLogger implements ILogger{
    @Override
    public void log(){
        System.out.println("debug logger");
    }
}
