package Mockito;

import Operations.Operations;


import org.junit.Test;
import org.junit.Before;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;



//@Mock
public class CalculatorServiceTest  {

    //@InjectMocks   //se utiliza para inyectar automáticamente los mocks creados
    private CalculatorService calculatorService;
    private Operations operationsMocks ;



     @Before
     public void setup(){
     //creamos un mock de la clase Operations
        operationsMocks= Mockito.mock(Operations.class);  //existe otra opcion con @Mock
         // Crear una instancia de CalculatorService con el mock
         calculatorService=new CalculatorService(operationsMocks);
     }


     @Test
    public void testPerformAdiccion() {
         //configurar el comportamiento del mock
    when(operationsMocks.suma(2.0,3.0)).thenReturn(5.0);
    // Lllamar el metodo bajo prueba

         double resultado=calculatorService.performAdiccion(2.0,3.0);

         //verificar el resultado
         assertEquals(5.0,resultado,0.001);
        //verificar que el metodo suma del mock fue llamado una vez
         verify(operationsMocks,times(1)).suma(2.0,3.0);
    }

    public void testPerformDivisionByZero() {
        // Configurar el comportamiento del mock para lanzar una excepción
         when(operationsMocks.division(6.0,0.0)).thenThrow(new IllegalArgumentException("divisor no puede ser 0"));

        // Llamar al método bajo prueba, que debería lanzar una excepción
         calculatorService.performDivision(6.0,0.0);

    }
}


/*
* Explicación
Configurar Mockito:

Mockito.mock(Operations.class): Crea un mock de la clase Operations.
when(operationsMock.suma(2.0, 3.0)).thenReturn(5.0): Configura el mock para devolver 5.0
* cuando se llame al método suma con los parámetros 2.0 y 3.0.

*
Probar el Método: Llamamos al método performAddition de CalculatorService y verificamos que devuelve el
* resultado esperado.
*
Verificar Llamadas al Mock:
verify(operationsMock, times(1)).suma(2.0, 3.0): Verifica que el método suma del mock fue
* llamado exactamente una vez con los parámetros 2.0 y 3.0.

*
*
Configurar Excepciones en el Mock:
when(operationsMock.division(6.0, 0.0)).thenThrow(new IllegalArgumentException("Divisor no puede ser cero")):
* Configura el mock para lanzar una excepción cuando se llame al método division con un divisor de 0.0.
* */