package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List {

    public static void main (String[] args){

        System.out.println("This is collections learning");
        // Array list is dynamic array
        // Array list is stores duplicate values
        // Array list maintains order
        // alist is not synchronised mean not threadsafe
    
    ArrayList L = new ArrayList();

     L.add(10);
     L.add(12);
     L.add(7);
     L.add(9);

    // System.out.println(L.size());

    // System.out.println(L.get(2));
    // System.out.println(L.add(L));

     for (int i=0;i<L.size();i++){
        System.out.println(L.get(i));
     }

     //generics

     ArrayList<String> LS= new ArrayList<String>();

      LS.add("Wraner Bros rounds are easy");
      LS.add("My package at Warner Bros is 130k");

     for (int j=0;j<LS.size();j++){
        System.out.println(LS.get(j));
     }


       System.out.println("******************************");   
        Warner WR1 = new Warner("Anu", 33,101);
        Warner WR2 = new Warner("Jatin",35,102);
        Warner WR3 = new Warner("Rahul",35,103);

             // Now creating arraylist of class Object type: Warner

      ArrayList<Warner> Wr = new ArrayList<Warner>();
            Wr.add(WR1);
            Wr.add(WR2);
            Wr.add(WR3);

            Iterator<Warner> Ir = Wr.iterator();
            while(Ir.hasNext()){
                Warner W=Ir.next();
                System.out.print(W.name+" ");
                System.out.print(W.age+" ");
                System.out.println(W.emp_id);



            }



    }

}
