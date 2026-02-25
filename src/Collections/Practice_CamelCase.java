package Collections;

import java.util.ArrayList;
import java.util.List;

public class Practice_CamelCase {

    public static void main(String[] args) {
        
     String x = "Dream";
     char[] c;
    c = x.toCharArray();

    String t= "i have wbd offer letter";
      
      
         String[] ar=t.split(" ");

        //  for(String s: ar){

        //    String temp=s.replace(s.charAt(0), Character.toUpperCase(s.charAt(0)));
        //    System.out.print(temp+" ");
       
        //  }
        List<Character> L = new ArrayList<>();
    //    String[] mp = new String[];

         for(String s: ar){
            char[] n = s.trim().toCharArray();
            for (int i=0;i<=n.length-1;i++){
             char u=Character.toUpperCase(n[i]);
             char l=Character.toLowerCase(n[i+1]);
                L.add(u);
                L.add(l);
            }
            
        } 
        System.out.println(L);   


    }

}
