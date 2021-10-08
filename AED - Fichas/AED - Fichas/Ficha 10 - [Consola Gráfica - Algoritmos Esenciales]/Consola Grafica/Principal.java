import java.awt.*;
public class Principal
{
    public static void main( String args[] )
    {
        // obtener el objeto GraphicsConsole...
        GraphicsConsole v = GraphicsConsole.getInstance();
        
        // mostrar la ventana...
        v.setVisible( true );
        
        // mostrar un rect�ngulo azul...
        v.setColor( Color.blue );
        v.drawRect( 5, 5, 100, 50 );
        
        // mostrar un c�rculo rojo...
        v.setColor( Color.red );
        v.drawOval( 112, 5, 50, 50 );
        
        // mostrar un rect�ngulo en sobre relieve...
        v.setColor( Color.darkGray );
        v.draw3DRect( 170, 5, 100, 50, true );
        
        // mostrar una cadena en color verde... fuente por default...
        v.setColor( Color.green );
        v.drawString( "Visualizaci�n de cadenas - Fuente default", 5, 80 );
        
        // mostrar otra cadena, color rojo... otra fuente...
        v.setColor( Color.red );
        Font f = new Font( Font.SERIF, Font.BOLD, 20 );
        v.setFont( f );
        v.drawString( "Otra cadena, con otra fuente...", 5, 105 );
        
        // mostrar un arco de c�rculo...
        v.setColor( Color.orange );
        v.drawArc( 280, 5, 50, 50, 0, 135 );
        
        // mostrar una l�nea...
        v.setColor( Color.gray );
        v.drawLine( 340, 5, 400, 50);
        
        // mostrar un pol�gono...
        int cx[] = {5, 65, 90};
        int cy[] = { 125, 190, 150};
        v.setColor( Color.yellow );
        v.drawPolygon( cx, cy, 3 );
        
        // mostrar un pol�gono pintado por dentro...
        int cx2[] = {120, 180, 205};
        int cy2[] = { 125, 190, 150};
        v.setColor( Color.lightGray );
        v.fillPolygon( cx2, cy2, 3 );
        
        // mostrar un rect�ngulo relleno en sobre relieve...
        v.setColor( Color.pink );
        v.fill3DRect( 230, 125, 100, 50, true );
        
        // mostrar un arco relleno de color ciena...
        v.setColor( Color.cyan );
        v.fillArc( 350, 125, 50, 50, 0, 135 );
        
        // mostrar un �valo azul pintado por dentro...
        v.setColor( Color.blue);
        v.fillOval( 5, 210, 100, 50 );     
              
        // mostrar un rect�ngulo naranja pintado por dentro...
        v.setColor( Color.orange );
        v.fillRect( 120, 210, 100, 50 );
        
        // mostrar un rect�ngulo con bordes redondeados...
        v.setColor( Color.green );
        v.drawRoundRect( 235, 210, 100, 50, 10, 10 );
        
        // mostrar un rect�ngulo relleno con bordes redondeados...
        v.setColor( Color.black );
        v.fillRoundRect( 350, 210, 100, 50, 10, 10 );
        
        // copiar toda el �rea rectangular... 550 pixels m�s a la derecha...
        v.copyArea( 0, 0, 450, 450, 600, 0 );
        
        // cambiar el origen de coordenadas...
        v.translate( 500, 350 );
        
        // ... y muestra un cuadrado con su esquina superior
        // en el origen del nuevo sistema...
        v.setColor( Color.red );
        v.fillRect( 0, 0, 100, 100 );
        
        
        // borra un �rea rectangular, pint�ndola de blanco...
        // v.setColor( Color.white );
        // v.clearRect( 30, 30, 200, 200 );
        
        // mostrar un mensaje en la consola est�ndar...
        System.out.println("Programa terminado...");
    }
}
