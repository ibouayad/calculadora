package com.exercise.ib.calculadora.controller;

import com.exercise.ib.calculadora.controller.util.Operador;
import com.exercise.ib.calculadora.controller.rest.ResponseBase;
import com.exercise.ib.calculadora.controller.rest.get.OperacionResult;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author imadb
 * @version 1.0.0
 */
public interface OperacionesController {

    /**
     * @param operand1 el primer numero .
     * @param operator el operador  .
     * @param operand2 el segundo numero .
     * @return the {@link ResponseEntity} con error {@code 200 (OK)} y con el resultado, o
     * con el error {@code 500 (Bad Request)} si hay algo mal.
     */
    @ApiOperation(value = "Obtener resultado de la operación")
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = ControllerConstants.API_RESPONSE_200),
        @ApiResponse(code = 500, message = ControllerConstants.API_RESPONSE_500)
    })
    @RequestMapping(value = "/operaciones", method = RequestMethod.GET, produces = {
        MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<ResponseBase<OperacionResult>> getOperacionResult(
        @RequestParam("primer numero") double operand1,
        @RequestParam("operador") Operador operator,
        @RequestParam("segundo numero") double operand2);

}
