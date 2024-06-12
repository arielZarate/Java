package Estaticos;


public class Main {

    public static void main(String[] args) {
        Contador c1 = new Contador();
        Contador c2 = new Contador();


        //METODO ESTATICO NO HACE FALTA LLAMAR A LA INSTANCIA C1 , SOLO A CONTADOR
        System.out.println("Contador: " + Contador.getCount());
    }

}



 class Contador {
    private static int count = 0; // Propiedad estática
    public Contador() {
        count++; // Incrementa el contador cada vez que se crea una instancia
    }
    public static int getCount() {
        return count; // Método estático para obtener el contador
    }
}

