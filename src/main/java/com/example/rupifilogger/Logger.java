package com.example.rupifilogger;

import java.io.Serializable;

import static com.example.rupifilogger.LogManager.buildSubject;
import static com.example.rupifilogger.LogManager.createChainOfLogger;

public class Logger implements Serializable {

    private static Logger logger;
    private static AbstractLogger chainOfLogger;
    private static LogSubject logSubject;
    private Logger(){
        if(logger!=null) throw new IllegalStateException("It is already created/initiated");
    }

    public static Logger getInstance(){
        if(logger == null){
            synchronized (Logger.class){
                if(logger == null){
                    logger = new Logger();
                    chainOfLogger = createChainOfLogger();
                    logSubject = buildSubject();
                }
            }
        }
        return logger;
    }

    void createLog( int level, String message){
        chainOfLogger.logMessage(level, message, logSubject);
    }

    void infoLog(String message){
        createLog(1,message);
    }

    void debugLog(String message){
        createLog(3,message);
    }

    void errorLog(String message){
        createLog(2,message);
    }
}