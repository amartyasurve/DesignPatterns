package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//       create a example that is following factory design pattern
//        ILogger infoLogger=FactoryLogger.createLogger(LogEnum.INFO);
//        ILogger errorLogger=FactoryLogger.createLogger(LogEnum.ERROR);
//        ILogger debugLogger=FactoryLogger.createLogger(LogEnum.DEBUG);
//
//        infoLogger.log();
//        errorLogger.log();
//        debugLogger.log();
        IFactoryLogger logger=new DebugFactoryLogger();
        logger.createClass().log();
    }
}