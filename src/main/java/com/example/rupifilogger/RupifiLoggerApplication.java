package com.example.rupifilogger;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RupifiLoggerApplication {

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.infoLog("This is INFO");
        //logger.debugLog("This is DEBUG");
        //logger.errorLog("This is ERROR");
    }

}
