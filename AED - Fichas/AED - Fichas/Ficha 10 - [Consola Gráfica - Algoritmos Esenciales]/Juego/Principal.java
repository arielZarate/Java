public class Principal
{
     public static void main (String args[])
    {
          System.out.println("Juego del n�mero secreto");
          System.out.println("La m�quina tiene un n�mero secreto, y Usted debe ");
          System.out.println("adivinarlo en no m�s de 5 intentos... Suerte\n\n");
          SecretNumberGame sng = new SecretNumberGame(50);
          sng.playGame();
    }
}
