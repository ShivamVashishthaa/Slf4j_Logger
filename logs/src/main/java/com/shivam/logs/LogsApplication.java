package com.shivam.logs;

import com.shivam.logs.test.PackageClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogsApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogsApplication.class, args);
        Logger logger = LoggerFactory.getLogger(LogsApplication.class);
        logger.debug("This is a debug message from root");  // all
        logger.info("This is an info message  from root");  // info, warn, error
        logger.warn("This is a warn message  from root");   // warn ,error
        logger.error("This is an error message  from root");    // error
        new PackageClass().log();
    }
}
