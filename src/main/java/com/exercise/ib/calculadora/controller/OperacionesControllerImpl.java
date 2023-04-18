package com.exercise.ib.calculadora.controller;

import com.exercise.ib.calculadora.controller.mapper.OperacionesMapper;
import com.exercise.ib.calculadora.controller.util.Operador;
import com.exercise.ib.calculadora.controller.rest.ResponseBase;
import com.exercise.ib.calculadora.controller.rest.get.OperacionResult;
import com.exercise.ib.calculadora.log.Logger;
import com.exercise.ib.calculadora.model.Operacion;
import com.exercise.ib.calculadora.service.OperacionesService;
import io.swagger.annotations.Api;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author imadb
 * @version 1.0.0
 */
@RestController
@Api(value = "Calculadora API", tags = {"Operaciones"})
public class OperacionesControllerImpl implements OperacionesController {
    private final org.slf4j.Logger log = LoggerFactory.getLogger(OperacionesControllerImpl.class);
    @Autowired
    private OperacionesMapper operationsMapper;
    @Autowired
    private OperacionesService operationsService;
    @Autowired
    private Logger logger;

    /**
     * Obtener resultado de la operación
     * @param operand1 el primer numero .
     * @param operador el operador  .
     * @param operand2 el segundo numero .
     * @return Obtener resultado de la operación.
     */
    @Override
    public ResponseEntity<ResponseBase<OperacionResult>> getOperacionResult(double operand1, Operador operador, double operand2) {
        Operacion operation = operationsMapper.toDTO(operand1, operador, operand2);
        double result = operationsService.execute(operation);
        log.debug("REST result : {}", result);
        logger.log(String.valueOf(result));
        return new ResponseEntity<>(new ResponseBase<>(new OperacionResult(result)), HttpStatus.OK);
    }

}
