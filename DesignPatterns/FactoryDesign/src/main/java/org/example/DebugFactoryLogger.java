package org.example;

public class DebugFactoryLogger implements IFactoryLogger{
    @Override
    public ILogger createClass(){
        return new DebugLogger();
    }
}
