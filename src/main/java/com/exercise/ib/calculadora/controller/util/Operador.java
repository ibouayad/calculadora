package com.exercise.ib.calculadora.controller.util;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author imadb
 * @version 1.0.0
 */
@AllArgsConstructor
@NoArgsConstructor
public enum Operador {
    SUM("+", "Operación aritmética para sumar dos números"),
    REST("-", "Operación aritmética para restar dos números") ,
    MULTI("*", "Operación aritmética para multiplicar dos números"),
    DIVI("/",  "AOperación aritmética para dividir dos números");

    private String representacion;
    private String descripcion;
}
