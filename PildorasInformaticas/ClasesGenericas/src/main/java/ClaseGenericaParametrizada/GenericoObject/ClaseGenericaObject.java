package ClaseGenericaParametrizada.GenericoObject;

public class ClaseGenericaObject<S> {


    private Object[] datosElemento;

    public ClaseGenericaObject(int tam) {
        datosElemento=new Object[tam];
    }

    public Object[] getDatosElemento() {
        return datosElemento;
    }

    public Object getElementoPosicion(int i )
    {
        return  datosElemento[i];
    }
    public void setDatosElemento(Object[] datosElemento) {
        this.datosElemento = datosElemento;
    }

    public void Add(Object o)
    {
        datosElemento[i]=o;
        i ++;
    }

    private int i=0;
}
