package SalaDeReuniones;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*

Cada reunión tiene un horario de inicio planificado (formato hhmm)
y un grupo de participantes(personas).
 */



public class Reunion{


  /**
   * variables:
   * horario de tipo Date
   * un array Persona de Tipo ArrayList<>()
   */
  private Date horario;
  private List<Persona> participante;

  public Reunion(){

  }

  public Reunion(Date horario, List <Persona> participantes) {
    this.horario = horario;
    this.participante = participantes;
  }



  /**
    metodos set & get
   */
  public Date getHorario() {
    return horario;
  }

  public void setHorario(Date horario) {
    this.horario = horario;
  }

  public List<Persona> getParticipantes() {
    return participante;
  }

  public void setParticipantes(List<Persona> participantes) {
    this.participante = participantes;
  }


  /**
   * Este metodo devuelve la cantidad de participantes
   * @return
   */
  public  int cantidadParticipantes() {

    int cont =0;
    for (int i = 0; i < participante.size(); i++) {
      cont ++;
    }
    return cont;
  }



  public  int cantidadReunionesAsistio(String nombre) {

    int cont =0;
    for (int i = 0; i < participante.size(); i++) {

      if(participante.get(i).getNombre().equals(nombre.toString()) )
      cont ++;
    }
    return cont;
  }

  /**
   * metodo toString() de la clase Reunion
   * genera una lista de participantes
   */
  @Override
  public String toString() {
    String formato="";

    //todoe esto es pàra mostrarlo en una lista hacia abajo
   String l="";
    for (Persona p: participante) {

        l+=p.toString() +"\n" ;
    }
    return
    formato= "Reunion{" +
            "horario=" + horario.toString() + "\n" +l;

  }

}
