package desafios.lavadora;

public class Ropa {

    private int kg;
    private TipoRopa tipo;
    private boolean llenado = false;

    public Ropa(int peso, TipoRopa tipo) {
        this.kg = peso;
        this.tipo = tipo;
    }



    public void setLlenado() {
        this.llenado = true;
    }

    public void lavadoRopa(int tiempo) {

        boolean valido = true;

        if (!llenado) {
            System.out.println("Debe llenar el lavarropas para poder iniciar el lavado");
            valido = false;
        }

        if (tipo == null) {
            System.out.println("Debe seleccionar el tipo de ropa para iniciar el lavado");
            valido = false;
        }

        if (this.kg < 0 || this.kg >= 7) {
            System.out.println("Verifique el peso debe ser menor a 7kg ");
            valido = false;
        }

        if (!valido) {
            return;
        }

        this.llenado = false;
        System.out.println("\nLavando por " + tiempo + " minutos");


    }


    public void secado() {
        if (this.kg >= 7) {
            System.out.println("El peso es mayor al soportado");
        }

        if (this.llenado == true) {
            System.out.println("Debe vaciar el lavarropas antes de iniciar el secado");
            return;
        }

        System.out.println("Secando....\n\n");
        int i = 0;
        while (i < 999990) {
            System.out.println("espere.....");
            i++;
        }

        System.out.println("\nFin del lavado.");
    }


}
