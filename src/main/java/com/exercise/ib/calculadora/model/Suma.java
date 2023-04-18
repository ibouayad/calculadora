package com.exercise.ib.calculadora.model;



/**
 * @author imadb
 * @version 1.0.0
 */
public class Suma extends OperacionBinaria {



    public Suma(double POperand, double SOperand) {
        this.primerOperando = POperand;
        this.segundoOperando = SOperand;
    }

    @Override
    public double execute() {
        return primerOperando + segundoOperando;
    }
}
