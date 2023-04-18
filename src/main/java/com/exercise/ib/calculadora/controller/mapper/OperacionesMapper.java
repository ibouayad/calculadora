package com.exercise.ib.calculadora.controller.mapper;

import com.exercise.ib.calculadora.controller.util.Operador;
import com.exercise.ib.calculadora.model.*;
import org.springframework.stereotype.Component;

/**
 * @author imadb
 * @version 1.0.0
 */
@Component
public class OperacionesMapper {

    public Operacion toDTO(double operand1, Operador operator, double operand2) {
        return operator.equals(Operador.SUM) ? new Suma(operand1, operand2)
                : operator.equals(Operador.REST) ? new Resta(operand1, operand2)
                : operator.equals(Operador.MULTI) ? new Multiplicar(operand1, operand2)
                : operator.equals(Operador.DIVI) ? new Division(operand1, operand2)
                : null;
    }
}
