package com.exercise.ib.calculadora.controller;

import org.springframework.stereotype.Service;

import java.math.BigInteger;

/**
 * @author imadb
 * @version 1.0.0
 */
@Service
public class CalculadoraCientificaService {

   /**
    *
    * @param num
    * @return
    */
   public BigInteger calculaFactorial(int num ) {
      if (num < 0) {
         throw new ArithmeticException("factorial solo se define para números positivos");
      }
      BigInteger result = BigInteger.ONE;
      for (int i = num; i > 0; i--) {
         result = result.multiply(BigInteger.valueOf(i));
      }
      return result;
   }

   /**
    *
    * @param num
    * @return
    */
   public boolean esPrimo(long num ) {
      if ( num <= 1) {
         return false;
      }
      for (int i = 2; i * i <= num; i++) {
         if (num % i == 0) {
            return false;
         }
      }
      return true;
   }
}
