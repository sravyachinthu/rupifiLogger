package com.example.rupifilogger;

public abstract class AbstractLogger {
    int level;
    AbstractLogger loggingLevel;

    public void setLoggingLevel(AbstractLogger loggingLevel){
        this.loggingLevel = loggingLevel;
    }

    void logMessage(int level, String message, LogSubject logSubject){
        if(this.level == level){
            display(message, logSubject);
        }
        if(loggingLevel!=null){
            loggingLevel.logMessage(level, message, logSubject);
        }
    }

    abstract void display(String message, LogSubject logSubject);
}
