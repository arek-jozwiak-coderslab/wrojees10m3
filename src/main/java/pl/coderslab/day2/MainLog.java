package pl.coderslab.day2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainLog {

    private static final Logger log = LogManager.getLogger(MainLog.class);

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            //jakieś operacja
            log.debug("i: {}", i);
        }
        log.debug("Debug");
        log.info("Info");
        log.warn("Warn");
        log.error("Error");
        log.fatal("Fatal");
        int a = 5;
        int b = 10;

        log.info("a: {}, b: {}", a, b);
    }
}