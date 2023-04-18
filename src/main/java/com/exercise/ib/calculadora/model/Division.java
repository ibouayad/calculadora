package com.exercise.ib.calculadora.model;

/**
 * @author imadb
 * @version 1.0.0
 */
public class Division extends OperacionBinaria {

    public Division(double POperand, double SOperand) {
        this.primerOperando = POperand;
        this.segundoOperando = SOperand;
    }

    /**
     * El metodo de restar.
     * @return
     */
    @Override
    public double execute() {
        return primerOperando / segundoOperando;
    }
}
