package com.example.rupifilogger;

public class FileLogger implements LogObserver{

    @Override
    public void log(String message){
        System.out.println("Writing to a file: "+message);
    }
}
