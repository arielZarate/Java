public class Punto
{
   private float x, y;

   public Punto()
   {
       x = y = 0;
   }
   
   public Punto( float cx, float cy )
   {
      x = cx;
      y = cy;
   }
   
   public float getX()
   {
      return x; 
   }
   
   public void setX( float cx )
   {
       x = cx;
   }

   public float getY()
   {
      return y; 
   }
   
   public void setY( float cy )
   {
       y = cy;
   }
   
   /**
    * Retorna el número de cuadrante al que pertenece el
    * punto. Si el punto está en un eje o en el origen,
    * entonces el método retorna un cero...
    * @return el número de cuadrante al que pertenece el 
    * punto, o cero si está en un eje o en el origen.
    */
   public int getCuadrante()
   {
       if( x > 0 && y > 0 ) return 1;
       if( x > 0 && y < 0 ) return 4;
       if( x < 0 && y > 0 ) return 2;
       if( x < 0 && y < 0 ) return 3;
       return 0;
   }
   
   /**
    * Calcula la distancia del punto al origen de 
    * coordenadas.
    * @return la distancia del punto al origen de
    * coordenadas.
    */
   public float distancia()
   {
       return ( float ) Math.sqrt( x*x + y*y ); 
   }
   
   /**
    * Calcula la longitud del segmento de recta que
    * une al punto que invoca al método y al punto 
    * pb entrado como parámetro. Es decir, calcula 
    * la distancia entre esos dos puntos.
    * @param pb el punto a usar para calcular la
    * distancia desde el punto que invoca al método.
    * @return la distancia entre los dos puntos.
    */
   public float distancia( Punto pb )
   {
       float crx = ( float ) Math.pow( pb.x - x, 2 );
       float cry = ( float ) Math.pow( pb.y - y, 2 );
       return ( float ) Math.sqrt( crx + cry ); 
   }
   
   /**
    * Calcula la pendiente de la recta que
    * une al punto que invoca al método y al punto 
    * pb entrado como parámetro. 
    * @param pb el punto a usar para calcular la
    * pendiente.
    * @return la pendiente de la recta que une a los
    * dos puntos.
    */
   public float pendiente( Punto pb )
   {
       float dx = pb.x - x;
       float dy = pb.y - y;
       return dy / dx; 
   }
   
   public String toString()
   {
       return "( " + x + ", " + y + " )"; 
   }
}
