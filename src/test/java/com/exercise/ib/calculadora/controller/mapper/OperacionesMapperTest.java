package com.exercise.ib.calculadora.controller.mapper;

import com.exercise.ib.calculadora.controller.util.Operador;
import com.exercise.ib.calculadora.model.Multiplicar;
import com.exercise.ib.calculadora.model.Operacion;
import com.exercise.ib.calculadora.model.Suma;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * @author imadb
 * @version 1.0.0
 */

public class OperacionesMapperTest {

    private static OperacionesMapper operacionesMapper;

    @BeforeAll
    public static void setUp() {
        operacionesMapper = new OperacionesMapper();
    }

    @Test
    public void sumaOperacionDTOTest() {
        double operand2 = 2;
        double operand1 = 1;
        Operacion operation = operacionesMapper.toDTO(operand1, Operador.SUM, operand2);
        Assertions.assertTrue(operation instanceof Suma);
        Assertions.assertEquals(((Suma) operation).getPrimerOperando(), operand1);
        Assertions.assertEquals(((Suma) operation).getSegundoOperando(), operand2);
    }


    @Test
    public void restaOperacionDTOTest() {
        double operand2 = 2;
        double operand1 = 1;
        Operacion operation = operacionesMapper.toDTO(operand1, Operador.MULTI, operand2);
        Assertions.assertTrue(operation instanceof Multiplicar);
        Assertions.assertEquals(((Multiplicar) operation).getPrimerOperando(), operand1);
        Assertions.assertEquals(((Multiplicar) operation).getSegundoOperando(), operand2);
    }
}
