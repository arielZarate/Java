package ClaseGenericaParametrizada.GenericoObject;

import ClaseGenericaParametrizada.GenericoObject.ClaseGenericaObject;

import java.io.File;

public class MainClaseObject {
    public static  void main(String[] args) {

        ClaseGenericaObject<String> archivos=new ClaseGenericaObject<>(4);

        archivos.Add("juan");
        archivos.Add("Maria");
        archivos.Add("Ana");
        archivos.Add("Pedro");

        /**
        Puedo agregarlos pero podria reventar
          *Agregando archivo de tipo file
         * aca abajo tenemos un problema que solo acepta de tipos String
         * Solucion clase parametrizada ArrayList<String> solo aceptara tipos String
         */
        archivos.Add(new File("gestionPedidos.dat"));


        /**
         * Primer Ejemplo de Generico de tipo Object sin paratetrizado
         *El problema es el casting redundante para recibir el dato de tipo xxx
         */
       String nombrePersona=(String)archivos.getElementoPosicion(1);
        System.out.println("El nombre es: " + nombrePersona);



       // File nombreArchivo=(File)archivos.getElementoPosicion(0);
        //System.out.println("El nombre del archivo(File) es: " + nombreArchivo);

    }
}
