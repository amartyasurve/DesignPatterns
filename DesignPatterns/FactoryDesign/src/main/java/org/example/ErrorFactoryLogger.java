package org.example;

public class ErrorFactoryLogger implements IFactoryLogger{
    @Override
    public ILogger createClass(){
        return new ErrorLogger();
    }
}
