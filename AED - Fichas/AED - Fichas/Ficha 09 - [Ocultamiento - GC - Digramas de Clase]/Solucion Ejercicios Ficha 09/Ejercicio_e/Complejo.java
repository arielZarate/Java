public class Complejo
{
   private float a;   // la parte real del complejo 
   private float b;   // la parte imaginaria

   public Complejo()
   {
       a = b = 0;
   }
   
   public Complejo( float pr, float pi )
   {
      a = pr;
      b = pi;
   }
   
   public float getReal()
   {
      return a; 
   }
   
   public void setReal( float pr )
   {
       a = pr;
   }

   public float getImaginaria()
   {
      return b; 
   }
   
   public void setImaginaria( float pi )
   {
       b = pi;
   }
   
   public Complejo sumar( Complejo cb )
   {
       Complejo s = new Complejo();
       s.setReal( a + cb.a );
       s.setImaginaria( b + cb.b );
       return s;
   }
   
   public Complejo restar( Complejo cb )
   {
       Complejo s = new Complejo( a - cb.a, b - cb.b );
       return s;
   }   
   
   public Complejo multiplicar( Complejo cb )
   {
       return new Complejo( a * cb.a - b * cb.b, a * cb.b + cb.a * b );
   }
   
   public float modulo()
   {
       return ( float ) Math.sqrt( a*a + b*b ); 
   }
   
   public Complejo conjugado()
   {
       return new Complejo( a, -b ); 
   }
   
   public String toString()
   {
       return "( " + a + ", " + b + " * i )"; 
   }
}
