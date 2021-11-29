package EqualsYHashCode;

import java.util.Objects;

public class Libro {

    /**
     * ISBN es un codigo unico que se le atribuye a un libro es unico
     */
    private int ISBN;
    private String titulo;
    private String autor;

    public Libro(int ISBN, String titulo, String autor) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


    @Override
    public String toString() {
        return "Libro{" +
                "ISBN=" + ISBN +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }

    /**
     * este equal es el original redefinido
     * @param o
     * @return ISBN
     */
    public  boolean equalsOriginalRedefinido(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        //hace el casting de Libro
        Libro libro = (Libro) o;
        return ISBN == libro.ISBN;
    }


    /**
     * siu modificamos el equals debemos redefinir el metodo hashCode
     * @return
     */
    public int hashCodeOriginal() {
        final int prime=31;
        int result =1;
        result=prime * result + ISBN;
        //return Objects.hash(ISBN);
        return result;
    }
}
