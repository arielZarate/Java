package paq02;
import paq01.*;
public class D extends A
{
    public void acceder()
    {
        // a1 = 0; // privado en A: no compila
        a2 = 0; // protegido en A
        a3 = 0; // público en A
        // a4 = 0; // default en A
    }
}
