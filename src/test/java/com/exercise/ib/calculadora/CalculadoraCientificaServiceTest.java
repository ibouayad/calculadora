package com.exercise.ib.calculadora;

import com.exercise.ib.calculadora.controller.CalculadoraCientificaService;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CalculadoraCientificaServiceTest {

   private CalculadoraCientificaService calculadoraCientificaService = new CalculadoraCientificaService();

   @Test
   void calculaFactorial() {
      assertEquals(BigInteger.ONE, calculadoraCientificaService.calculaFactorial(0));
      assertEquals(BigInteger.ONE, calculadoraCientificaService.calculaFactorial(1));
      assertEquals(BigInteger.TWO, calculadoraCientificaService.calculaFactorial(2));
      assertEquals(BigInteger.valueOf(120), calculadoraCientificaService.calculaFactorial(5));
   }

   @Test
   void calculaFactorial_NumerosLargos() {
      assertEquals(BigInteger.valueOf(2432902008176640000L), calculadoraCientificaService.calculaFactorial(20));
      assertEquals(new BigInteger("815915283247897734345611269596115894272000000000"), calculadoraCientificaService.calculaFactorial(40));
   }

   @Test
   void esPrimo() {
      assertFalse(calculadoraCientificaService.esPrimo(1));
      assertTrue(calculadoraCientificaService.esPrimo(2));
      assertTrue(calculadoraCientificaService.esPrimo(3));
      assertFalse(calculadoraCientificaService.esPrimo(6));
      assertTrue(calculadoraCientificaService.esPrimo(7));
      assertFalse(calculadoraCientificaService.esPrimo(10));
   }

   @Test
   void esPrimo_NumerosLargos() {
      assertTrue(calculadoraCientificaService.esPrimo(99877));
      assertFalse(calculadoraCientificaService.esPrimo(324234));
   }
}