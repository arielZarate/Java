package Operations;

public class Operations {


    public Operations(){

    }

    public double suma(Double a, Double b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Los operandos no pueden ser null");
        }
        return a + b;
    }



    public double multiplicacion(Double a, Double b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Los operandos no pueden ser null");
        }
        return a * b;
    }

    public double resta(Double a, Double b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Los operandos no pueden ser null");
        }
        return a - b;
    }

        public double division(Double a, Double b) {

            if (b == null) {

                throw new IllegalArgumentException("Divisor no puedee ser null");
            }

            if(b==0.0)
            {
                throw new IllegalArgumentException("Divisor no puede ser cero");
            }

            return a/b;
        }
}
