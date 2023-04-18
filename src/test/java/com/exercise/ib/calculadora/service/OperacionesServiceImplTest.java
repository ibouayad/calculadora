package com.exercise.ib.calculadora.service;

import com.exercise.ib.calculadora.model.Resta;
import com.exercise.ib.calculadora.model.Suma;
import com.exercise.ib.calculadora.service.impl.OperacionesServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * @author imadb
 * @version 1.0.0
 */
public class OperacionesServiceImplTest {

    private static OperacionesService operationsService;

    @BeforeAll
    public static void setup() {
        operationsService = new OperacionesServiceImpl();
    }

    /**
     * Addition service test
     */
    @Test
    public void operationsServiceExecuteAdditionTest() {
        Assertions.assertEquals(operationsService.execute(new Suma(1, 2)), 3);
    }

    /**
     * Subtraction service test
     */
    @Test
    public void operationsServiceExecuteSubtractionTest() {
        Assertions.assertEquals(operationsService.execute(new Resta(5, 2)), 3);
    }
}
