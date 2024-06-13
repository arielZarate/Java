/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones.Excepciones_1;

/**
 *
 * @author ArielZarate
 */



//HEREDA EXCEPTION
public class OperationException extends Exception
{
    
    
    //construtor
    public OperationException(String mensaje)
    {
        super(mensaje);
    }
    

    
}
