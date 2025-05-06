package org.example;

public class FactoryLogger {
   public static ILogger createLogger(LogEnum loglevel) {
//       return switch (loglevel) {
//           case DEBUG -> new DebugLogger();
//           case INFO -> new InfoLogger();
//           case ERROR -> new ErrorLogger();
//       };
       switch (loglevel){
           case DEBUG:return new DebugLogger();
           case INFO:return new InfoLogger();
           case ERROR:return new ErrorLogger();
           default:return null;
       }

   }
}
