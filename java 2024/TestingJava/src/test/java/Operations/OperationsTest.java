package Operations;

import org.junit.Test;
import static org.junit.Assert.*;

public class OperationsTest  {


    @Test
    public void testSuma() {
      Operations operations=new Operations();
      double resultado= operations.suma(2.0,5.0);

      //con una tolerancia de 0.001. Esto es útil para comparar números de punto flotante.
      assertEquals(7.0,resultado,0.001);

    }


    @Test
    public void testResta() {
        Operations operations=new Operations();
        double resultado= operations.resta(2.0,5.0);

        //con una tolerancia de 0.001. Esto es útil para comparar números de punto flotante.
        assertEquals(-3.0,resultado,0.001);

    }


    @Test
    public void testMultiplicacion() {
        Operations operations = new Operations();
        double resultado = operations.multiplicacion(2.0, 3.0);
        assertEquals(6.0, resultado, 0.001);
    }


    @Test
    public void testDivision() {
        Operations operations = new Operations();
        double resultado = operations.division(6.0, 3.0);
        assertEquals(2.0, resultado, 0.001);
    }


    @Test(expected = IllegalArgumentException.class)
    public void testDivisionPorCero() {
        Operations operations = new Operations();
        operations.division(6.0, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisionPorNull() {
        Operations operations = new Operations();
        operations.division(6.0, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSumaPorNull() {
        Operations operations = new Operations();
        operations.suma(6.0, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMultiplicacionPorNull() {
        Operations operations = new Operations();
        operations.multiplicacion(6.0, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRestaPorNull() {
        Operations operations = new Operations();
        operations.resta(6.0, null);
    }
}