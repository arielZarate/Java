package EstructuraDatos.ListasTipoPila;


/**
 * las listas poseen nodos donde cada nodo tiene [raiz][apuntador al siguiente]-> [nodo]
 * <p>
 * Listas
 * # tipo Pilas  (LIFO | FIFO)
 * # Cola
 * # Genericas
 */
public class Pila {
    private Nodo cima;
    private  int tamanio = 0;
    String list = "";


    public Pila() {
        this.cima = null;
        tamanio = 0;
    }

    public boolean estaVacia() {
        return cima == null;
    }

    public void addElement(int value){
        Nodo nuevo=new Nodo(value);
        nuevo.siguiente=cima;
        cima=nuevo;
        tamanio++;


    }


}
