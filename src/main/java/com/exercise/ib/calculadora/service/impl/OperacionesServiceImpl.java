package com.exercise.ib.calculadora.service.impl;

import com.exercise.ib.calculadora.model.Operacion;
import com.exercise.ib.calculadora.service.OperacionesService;
import org.springframework.stereotype.Component;

/**
 * @author imadb
 * @version 1.0.0
 */
@Component
public class OperacionesServiceImpl implements OperacionesService {

    @Override
    public double execute(Operacion operation) {
        return operation.execute();
    }
}
