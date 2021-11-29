package LinkedList;





import java.util.LinkedList;
import java.util.ListIterator;


public class LinkedList_Iterador {
    

    public static void main(String[] args) {

      Cliente cl1=new Cliente(4367846,"Ramon Valdez",5000000);
       Cliente cl2=new Cliente(87436784,"Maria Antonieta de las Nieves",4000000);
      Cliente cl3=new Cliente(86758677,"Roberto Bolañoz",9999000);
       Cliente cl4=new Cliente(783674,"Carlos Alberto Villagran",3800000);
       Cliente cl5=new Cliente(783674,"Carlos Alberto Villagran",3800000);

        /**
         * lk es un collecion como List
         */
  LinkedList <Cliente>lk =new LinkedList<>();
 
       lk.add(cl1);
       lk.add(cl2);
       lk.add(cl3);
       lk.add(cl4);
       lk.add(cl5);


        for (Cliente c:lk ) {
            System.out.println("Lista de nombres:" + c.getNombre());
        }

        System.out.println("Tamaño de lista :" + lk.size());

        System.out.println("\n*****LISTITERTOR******");
        ListIterator<Cliente> it=lk.listIterator();
        //it.next();
        while(it.hasNext())
        {
            System.out.println(it.next().getNombre());
        }



        for (Cliente c:lk ) {
           // System.out.println(c);
        }





    }
}
