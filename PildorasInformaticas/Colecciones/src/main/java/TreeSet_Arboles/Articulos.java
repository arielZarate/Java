package TreeSet_Arboles;

import java.util.Objects;

public class Articulos implements Comparable {

    private  int _id;
    private  String name;

    public Articulos(int _id, String name) {
        this._id = _id;
        this.name = name;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     *
     * @param
     * @return un True o False si el objeto es igual comparado por el nombre
     */


    @Override
    public String toString() {
        return "Articulos{" +
                "_id=" + _id +
                ", name='" + name + '\'' +
                '}';
    }


    /**
     *Metodos Redefinidos
     */
    @Override
    public int compareTo(Object o) {

        Articulos a= (Articulos) o;
       if(this._id -a._id >0)
        return  1;
       else
       if(this._id-a._id <0){
           return -1;
       }
       else {
           return 0;
       }
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Articulos)) return false;
        Articulos articulos = (Articulos) o;
        return get_id() == articulos.get_id() && Objects.equals(getName(), articulos.getName());
    }
    @Override
    public int hashCode() {
        int prime=13;
        int hash=1;
        hash=hash*prime+this._id;
        return hash;
    }

}
