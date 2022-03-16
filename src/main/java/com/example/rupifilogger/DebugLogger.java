package com.example.rupifilogger;

public class DebugLogger extends AbstractLogger{

    public DebugLogger(int level){
        this.level = level;
    }

    @Override
    void display(String message, LogSubject logSubject){
        System.out.println("DEBUG : "+ message);
        logSubject.notifyAllObserver(1, message);
    }
}
