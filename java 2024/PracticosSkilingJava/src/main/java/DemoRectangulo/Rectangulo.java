package DemoRectangulo;



//esta clase esta creada para test

public class Rectangulo {

    private int ancho;

    private int alto;



    public Rectangulo(int ancho,int alto){
        this.ancho=ancho;
        this.alto=alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }



    public int area(){

        return this.alto*this.ancho;
    }

    public int perimetro(){
        return 2*ancho + 2*alto;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                '}';
    }
}
