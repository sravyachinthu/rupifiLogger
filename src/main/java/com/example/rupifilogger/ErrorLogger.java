package com.example.rupifilogger;

public class ErrorLogger extends AbstractLogger{

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    void display(String message, LogSubject logSubject){
        System.out.println("ERROR : "+ message);
        logSubject.notifyAllObserver(1, message);
    }
}
