package com.exercise.ib.calculadora.model;

import lombok.Getter;

/**
 * @author imadb
 * @version 1.0.0
 */
@Getter
public abstract class OperacionBinaria implements Operacion {

    double primerOperando;
    double segundoOperando;
}
