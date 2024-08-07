package Mockito;

import Operations.Operations;


/*
 *
 *
 * Supongamos que tienes una clase CalculatorService que depende de otra clase Operations
 * para realizar operaciones matemáticas. Queremos probar CalculatorService usando Mockito
 * para simular las operaciones.
 */



public class CalculatorService {

  //reutilizamos la clase Operations ya creada de antes que esta en otro package
    private Operations operations;



    public CalculatorService(Operations operations){

        this.operations=operations;

    }


    public double performAdiccion(double a, double b){
        return  operations.suma(a,b);
    }

    public double performDivision(double a, double b) {
        return operations.division(a, b);
    }

}
