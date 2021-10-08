public class Principal
{
     public static void main (String args[])
    {
          System.out.println("Juego del número secreto");
          System.out.println("La máquina tiene un número secreto, y Usted debe ");
          System.out.println("adivinarlo en no más de 5 intentos... Suerte\n\n");
          SecretNumberGame sng = new SecretNumberGame(50);
          sng.playGame();
    }
}
