package org.example.unittests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Random;

/**
 * El nuevo becario se ha encargado de programar una nueva calculadora para nuestro sistema de cobro en caja.
 * Antes de desplegarla en producción, nos han pedido verificar que cumple unos mínimos de calidad.
 * Debemos comprobar el correcto funcionamiento de la "calculadora segura" que nos ha proporcionado.
 * En caso de detectar comportamiento erróneo, arreglalo y comprueba que el test funciona correctamente.
 * En concreto, es necesario verificar la siguiente funcionalidad:
 * - En caso de intento de división entre 0, debe tirar ArithmeticException.
 * - Debe protegerse contra Overflows de forma correcta: por ejemplo la multiplicacion de dos numeros positivos nunca puede dar un numero negativo. En caso de overflow, tirar ArithmeticException.
 * - Debe generar numeros aleatorios de forma correcta, en el limite pedido
 * - Debe detectar correctamente cuando un numero es par y cuando un numero es impar
 * - Debe emitir mensajes de log si ha sido configurada para ello.
 */
public class SecureCalculatorTests {

    /**
     * Verify calculator is successfully created
     */
    @Test
    public void smokeTest(){
        SecureCalculator calculator = new SecureCalculator();
        Assertions.assertNotNull(calculator);
    }

    @Test /*??*/
    public void logTest(){
        SecureCalculator calculator = new SecureCalculator();

    }

    @Test
    public void multiplyTest (){
        SecureCalculator calculator = new SecureCalculator();
        long i = Long.MAX_VALUE;
            for (long j = 0; j<100; j++)
                Assertions.assertEquals(calculator.multiply((int) i, (int) j), i*j);
    }

    @Test
    public void isEvenTest(){
        SecureCalculator calculator = new SecureCalculator();
        for (int i = 0; i<100; i++){
            Assertions.assertTrue(calculator.isEven(2));
        }
    }

    @Test
    public void divideTest(){
        SecureCalculator calculator = new SecureCalculator();
        Assertions.assertThrows(ArithmeticException.class, () -> {
            for (int i = 0; i<100; i++){
                calculator.divide(i, 0);
            }
        });
    }

    @Test
    public void modTest(){
        SecureCalculator calculator = new SecureCalculator();
    }

    @Test
    public void isOddTest(){
        SecureCalculator calculator = new SecureCalculator();
    }
}
