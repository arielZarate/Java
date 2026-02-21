package desafios.calculaIngresoAdicional;




/***
 * DEvuleve el ingreso adicional de un empleado por el valor dado baseSalary y bonusRate.
 * La formula para calcular el ingreso adicional es:
 * Bonus=salary*(bonusRate/100)
 * */
public class Main {


    public static double calculateBonus(double salary, double bonusRate){
      //si el bonus es de 10% y el salario 5000 el bonus es 5000*(10/100)=500

          return  salary * (bonusRate/100);
    }


    public static void main(String[] args) {
        System.out.println(calculateBonus(5000,10) ); //500
        System.out.println(calculateBonus(7500,15) ); //1125
    }
}
