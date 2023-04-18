package com.exercise.ib.calculadora.log;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * @author imadb
 * @version 1.0.0
 */
public class LoggerTest {

    private static Logger logger;

    @BeforeAll
    public static void setUp() {
        logger = new LoggerImpl();
    }

    /**
     * Trace test
     */
    @Test
    public void traceTest() {
        logger.log("5");
        logger.log("texto");
    }
}
