package org.example;

public class InfoFactoryLogger implements IFactoryLogger{
    @Override
    public ILogger createClass(){
        return new InfoLogger();
    }
}
