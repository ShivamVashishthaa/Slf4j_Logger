package com.shivam.logs.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PackageClass {
    public void log() {
        Logger logger = LoggerFactory.getLogger(PackageClass.class);
        logger.debug("This is a debug message from package");
        logger.info("This is an info message  from package");
        logger.warn("This is a warn message   from package");
        logger.error("This is an error message   from package");
    }
}
