package com.example.rupifilogger;

public class LogManager {

    protected static AbstractLogger createChainOfLogger(){
        AbstractLogger infoLogger = new InfoLogger(1);
        AbstractLogger errorLogger = new ErrorLogger(2);
        AbstractLogger debugLogger = new DebugLogger(3);

        infoLogger.setLoggingLevel(errorLogger);
        errorLogger.setLoggingLevel(debugLogger);

        return infoLogger;
    }

    static LogSubject buildSubject(){
        LogSubject logSubject = new LogSubject();
        ConsoleLogger consoleLogger = new ConsoleLogger();
        FileLogger fileLogger = new FileLogger();

        logSubject.addObserver(1, consoleLogger);

        logSubject.addObserver(1, fileLogger);

        return logSubject;
    }
}
