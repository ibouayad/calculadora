package com.exercise.ib.calculadora.log;

import io.corp.calculator.TracerImpl;
import org.springframework.stereotype.Component;
/**
 * @author imadb
 * @version 1.0.0
 */
@Component
public class LoggerImpl implements Logger {

    private TracerImpl tracerImpl;

    /**
     * Empty constructor
     */
    public LoggerImpl() {
        this.tracerImpl = new TracerImpl();
    }

    private TracerImpl getTracerImpl() {
        return tracerImpl == null ? tracerImpl = new TracerImpl() : tracerImpl;
    }

    @Override
    public void log(String message) {
        getTracerImpl().trace(message);
    }
}
