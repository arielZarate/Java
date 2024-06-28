package PracticoGenericoListasExcepciones;

//codigo ejecutor

import PracticoGenericoListasExcepciones.excepciones.LibraryException;
import PracticoGenericoListasExcepciones.model.*;


import java.util.ArrayList;
import java.util.List;

public class Main {


    public static  void main(String[] args) throws LibraryException {


        LibraryGeneric<Book> library=new LibraryGeneric<>();

        library.addItem(new FictionBook("The Great Gatsby", "F. Scott Fitzgerald"));
        library.addItem(new NoFictionBook("Sapiens", "Yuval Noah Harari"));
        library.addItem(new FictionBook("1984","George orwell"));
        library.addItem(new FictionBook("Angeles y demonios","Dan Brown"));

        System.out.println("******Biblioteca de Libros***********");

     library.showItems();



        //otra forma pero que no es generica es asi debes crear la lista y luego iterarla

        List <FictionBook> fictionBookList=new ArrayList<>();
        fictionBookList.add(new FictionBook("1984","George orwell"));
        fictionBookList.add(new FictionBook("Angeles y demonios","Dan Brown"));

        System.out.println("******Fiction Books Modo no generico**********");
        LibraryUtils.ShowBooks(fictionBookList);







    }
}
