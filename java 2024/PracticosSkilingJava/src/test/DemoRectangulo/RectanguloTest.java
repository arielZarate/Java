package DemoRectangulo;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectanguloTest {


     /*
     assertAll(

             ()-> assertEquals(12,r.area()),
             ()->assertEquals(14,r.perimetro())

     );
    * */

 @Test
  public void TestArea(){
     Rectangulo r=new Rectangulo(5,10);
     assertEquals(50,r.area(),"El area debe ser 50");
 }


 @Test
    public void TestPerimetro(){
     Rectangulo r=new Rectangulo(5,10);

     assertEquals(30,r.perimetro(),"El perimetro debe ser 30");
 }


 @Test
    public void TestGetAncho(){
     Rectangulo r=new Rectangulo(5,10);

     assertEquals(5,r.getAncho(),"El ancho  debe ser 5");
 }



    @Test
    public void testGetAlto() {
        Rectangulo rectangulo = new Rectangulo(5, 10);
        assertEquals(10, rectangulo.getAlto(), "El alto debe ser 10");
    }
 
}