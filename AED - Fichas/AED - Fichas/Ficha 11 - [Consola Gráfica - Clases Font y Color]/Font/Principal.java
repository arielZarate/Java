import java.awt.*;
public class Principal
{
    public static void main( String args[] )
    {        
        GraphicsConsole v = GraphicsConsole.getInstance();
        v.setVisible( true );
        
        Font f = new Font( Font.SERIF, Font.BOLD, 12 );
        v.setFont( f );
        v.setColor( Color.red );
        v.drawString( "Fuente: SERIF - Estilo: BOLD - Tamaño: 12", 10, 20 );

        f = new Font( Font.SANS_SERIF, Font.BOLD, 12 );
        v.setFont( f );
        v.setColor( Color.blue );
        v.drawString( "Fuente: SANS_SERIF - Estilo: BOLD - Tamaño: 12", 10, 40 );
    
        f = new Font( Font.DIALOG, Font.BOLD, 12 );
        v.setFont( f );
        v.setColor( Color.green );
        v.drawString( "Fuente: DIALOG - Estilo: BOLD - Tamaño: 12", 10, 60 );

        f = new Font( Font.DIALOG_INPUT, Font.BOLD, 12 );
        v.setFont( f );
        v.setColor( Color.black );
        v.drawString( "Fuente: DIALOG_INPUT - Estilo: BOLD - Tamaño: 12", 10, 80 );
        
        f = new Font( Font.MONOSPACED, Font.BOLD, 12 );
        v.setFont( f );
        v.setColor( Color.orange );
        v.drawString( "Fuente: MONOSPACED - Estilo: BOLD - Tamaño: 12", 10, 100 );
        
        f = new Font( "TimesRoman", Font.PLAIN, 12 );
        v.setFont( f );
        v.setColor( Color.red );
        v.drawString( "Fuente: TimesRoman - Estilo: PLAIN - Tamaño: 12", 10, 140 );
        
        f = new Font( "TimesRoman", Font.ITALIC, 12 );
        v.setFont( f );
        v.setColor( Color.blue );
        v.drawString( "Fuente: TimesRoman - Estilo: ITALIC - Tamaño: 12", 10, 160 );
        
        f = new Font( "TimesRoman", Font.BOLD, 12 );
        v.setFont( f );
        v.setColor( Color.yellow );
        v.drawString( "Fuente: TimesRoman - Estilo: BOLD - Tamaño: 12", 10, 180 );
        
        f = new Font( "Helvetica", Font.PLAIN, 12 );
        v.setFont( f );
        v.setColor( Color.red );
        v.drawString( "Fuente: Helvetica - Estilo: PLAIN - Tamaño: 12", 10, 220 );
        
        f = new Font( "Helvetica", Font.ITALIC, 12 );
        v.setFont( f );
        v.setColor( Color.blue );
        v.drawString( "Fuente: Helvetica - Estilo: ITALIC - Tamaño: 12", 10, 240 );
        
        f = new Font( "Helvetica", Font.BOLD, 12 );
        v.setFont( f );
        v.setColor( Color.yellow );
        v.drawString( "Fuente: Helvetica - Estilo: BOLD - Tamaño: 12", 10, 260 );
        
        f = new Font( "Arial", Font.BOLD + Font.ITALIC, 12 );
        v.setFont( f );
        v.setColor( Color.green );
        v.drawString( "Fuente: Arial - Estilo: BOLD ITALIC - Tamaño: 12", 10, 300 );
        
        f = new Font( "Courier", Font.BOLD, 12 );
        v.setFont( f );
        
        Color c = new Color( 180, 180, 180 );
        v.setColor( c );
        
        v.drawString( "Fuente: Courier - Estilo: BOLD - Tamaño: 12", 10, 320 );
        
    }
}
