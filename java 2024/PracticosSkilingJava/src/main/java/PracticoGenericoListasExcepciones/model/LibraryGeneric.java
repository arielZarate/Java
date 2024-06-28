package PracticoGenericoListasExcepciones.model;
import  PracticoGenericoListasExcepciones.excepciones.*;

import java.util.ArrayList;
import java.util.List;

//notar que la clase generica es de tipo heredado por Book
public class LibraryGeneric<T extends Book> {


    private List<T> items;


    //constructor
    public LibraryGeneric() {
        this.items = new ArrayList<>();  //se crea con una capacidad de10;
    }


    public void addItem(T elem) throws LibraryException {

        if (elem == null) {
            throw new LibraryException("Cannnot add a null item to the library");
        }

        items.add(elem);
    }

    public void removeItem(T elem) throws LibraryException {

        //metodo contains
        if (!items.contains(elem)) {
            throw new LibraryException("item not found in the library");
        }

        //si esta lo elimina
        items.remove(elem);
    }


    public List<T> getItems() {

        return items;
    }



    public void showItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }




}
