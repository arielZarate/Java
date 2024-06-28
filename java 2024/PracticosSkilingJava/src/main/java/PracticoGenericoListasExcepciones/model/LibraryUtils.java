package PracticoGenericoListasExcepciones.model;


import java.util.List;

//esta clase sirve para poder ejecutar un metodo que itera cualquier coleccion de cualquier Tipo
public class LibraryUtils {


    public static void ShowBooks(List<? extends Book> books )
    {

        for(Book book:books)
        {
            System.out.println(book);
        }
    }


}
