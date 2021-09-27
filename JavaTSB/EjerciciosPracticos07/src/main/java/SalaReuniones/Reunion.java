package SalaReuniones;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/*

Cada reunión tiene un horario de inicio planificado (formato hhmm)
y un grupo de participantes(personas).
 */


public class Reunion implements Comparable<Reunion> {


    /**
     * variables:
     * horario de tipo Date
     * un array Persona de Tipo ArrayList<>()
     */
    private ArrayList<Calendar> horario=new ArrayList<>();
    private ArrayList<Persona> participantes;

    public Reunion() {

    }

    //Prestar atencion como ingresa el horario lo agrego en el contructor como un solo param
    // y no como un arrayList  en cambio los participantes si  entran el lista
    public Reunion(Calendar horario, ArrayList<Persona> participantes) {
        this.horario.add(horario);
        this.participantes = participantes;
    }



    public ArrayList<Calendar> getHorario()
    {

        return this.horario;
    }

  /*
    public String  getHorario() {
       String str="";

        for (int i = 0; i < horario.size(); i++) {

            str+= FormatearHora(horario.get(i));
        }
        return str;
    }

   */
    public void setHorario(int x, Calendar horario) {

        this.horario.set(x, horario);
    }

    public ArrayList<Persona> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Persona> participantes) {
        this.participantes = participantes;
    }


    /**
     * Este metodo devuelve la cantidad de participantes
     *
     * @return
     */
    public int cantidadParticipantes() {
        int count=0;
        for (int i = 0; i < participantes.size() ; i++) {
            count ++;
        }

        return count;
    }


    public int cantidadReunionesAsistio(String nombre) {

        int cont = 0;
        for (int i = 0; i < participantes.size(); i++) {

            if (participantes.get(i).getNombre().equals(nombre.toString()))
                cont++;
        }
        return cont;
    }


    public String FormatearHora(Calendar horario) {
        Date time = horario.getTime();
        //formateamos la hora con un pattern

        String horaFormat = new SimpleDateFormat("HH:mm").format(time);
        return horaFormat;
    }


    public ArrayList<String> converterStringHorario()
    {
        ArrayList<String> horarioStr=new ArrayList<>();
        for (int i = 0; i < horario.size() ; i++) {
            /**
             aplicamos el formateador
             */

            horarioStr.add(FormatearHora(horario.get(i)));
        }
        return horarioStr;
    }







    /**
     * metodo toString() de la clase Reunion
     * genera una lista de participantes
     *
     * @return
     */
    @Override


    public String toString() {
        String res = null;
        res = "";

        //todoe esto es pàra mostrarlo en una lista hacia abajo
        String ps = " ";


                for (int i = 0; i < participantes.size(); i++) {
                ps +=  participantes.get(i) + " ";

        }
        String ps2="2";
                for (int j = 0; j < horario.size(); j++) {
                    ps2 +=  "\n Horario: " + FormatearHora(horario.get(j)) + " hs"+
                            "\n" + ps ;
                }
        res+= "\nReunion{" +ps2 +"}";
        return res;

        }



    public int compareTo(ArrayList participantes) {
        return 0;
    }

    public int compareTo(String a, String b) {
        return a.compareTo(b);
    }


    /*
     public String  cantidadReunionesPorHorario()
    {
        String res = null;
        res = "";

        //todoe esto es pàra mostrarlo en una lista hacia abajo
        String ps = " ";


        for (int i = 0; i < participantes.size(); i++) {
            ps +=  participantes.get(i) + " ";

        }

        String ps2="";
        for (int j = 0; j < horario.size(); j++) {
            ps2 +=  "\n Horario: " + FormatearHora(horario.get(j)) + " hs"+
                    "\n" + ps ;
        }
        res+= "\nReunion{" +ps2 +"}";
        return res;

    }
     */




    public void ListaOrdenado()
    {
        //horario.sort((h1,h2)-> h1.compareTo(h2));
        ArrayList <String> hs=converterStringHorario();
        /**
         *no lo esta ordenando
         */
        hs.sort((h1,h2)-> h1.compareTo(h2));
        for (int i = 0; i < hs.size(); i++) {

            System.out.println();

        }
    }

    @Override
    public int compareTo(Reunion o) {
        return 0;
    }
}



