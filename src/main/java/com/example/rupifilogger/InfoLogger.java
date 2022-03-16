package com.example.rupifilogger;

public class InfoLogger extends AbstractLogger{

    public InfoLogger(int level){
        this.level = level;
    }

    @Override
    void display(String message, LogSubject logSubject){
        System.out.println("Information : "+ message);
        logSubject.notifyAllObserver(1, message);
    }
}
