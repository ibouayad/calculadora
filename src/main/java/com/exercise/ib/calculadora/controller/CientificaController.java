package com.exercise.ib.calculadora.controller;

import com.exercise.ib.calculadora.log.Logger;
import com.exercise.ib.calculadora.model.ApiResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.math.BigInteger;

import static com.exercise.ib.calculadora.model.ResultBuilder.getResult;
import static com.exercise.ib.calculadora.model.ResultBuilder.getResultFromError;

/**
 * @author imadb
 * @version 1.0.0
 */
@RestController
@RequestMapping("/cientifica")
public class CientificaController {

   private final CalculadoraCientificaService calculadoraCientificaService;

   @Autowired
   private Logger logger;


   public CientificaController(CalculadoraCientificaService scientificCalculator) {
      calculadoraCientificaService = scientificCalculator;
   }

   /**
    *
    * @param factor
    * @return
    */
   @GetMapping("/Cuadrada/{factor}")
   public ApiResult Cuadrada(@PathVariable BigDecimal factor ) {
      return getResult(factor.multiply(factor));
   }

   /**
    *
    * @param num
    * @return
    */
   @GetMapping("/factorial/{num}")
   public ApiResult factorial(@PathVariable int num ) {
      try {
         BigInteger factorial = calculadoraCientificaService.calculaFactorial(num);
         return getResult(factorial);
      }
      catch ( ArithmeticException e ) {
         logger.log(e.getMessage().toString());
         return getResultFromError(e.getMessage());
      }
   }

   /**
    *
    * @param num
    * @return
    */
   @GetMapping("/prime/{num}")
   public ApiResult primo(@PathVariable long num ) {
      return getResult(calculadoraCientificaService.esPrimo(num));
   }
}
