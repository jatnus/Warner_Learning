package Collections;


import java.util.HashMap;
import java.util.Map;


public class Anagram {

   public static void main(String[] args){

    String s= "aacc";
    String t= "ccac";

       if (s.length() != t.length()){

         System.out.println("Not anagram");
       }

        // int[] count = new int[26]; // for 'a' to 'z'
          int count1=0;
          int count2=0;
        Map<Character,Integer> map_s= new HashMap<>();
        Map<Character,Integer> map_t= new HashMap<>();
      
          for(int i=0;i<s.length();i++){
          
            if(map_s.containsKey(s.charAt(i))){
               count1= map_s.get(s.charAt(i));
                map_s.put(s.charAt(i),count1+1);
               //   System.out.println(map_s);
                }
               
            else {
                map_s.put(s.charAt(i),1);   
               //  System.out.println(map_s);    
            }
             
          }
              for(int j=0;j<t.length();j++){
          
            if(map_t.containsKey(t.charAt(j))){
                   count2= map_t.get(t.charAt(j));
                map_t.put(t.charAt(j),count2+1);
               //  System.out.println(map_t);
                }
            else {
                map_t.put(t.charAt(j),1);   
               //  System.out.println(map_s);    
            }

         }
    
     if(map_s.equals(map_t)){
        System.out.println("anagram");
         System.out.println(map_s);
         System.out.println(map_t);
     }else{
        System.out.println("Not anagram");
                 System.out.println(map_s);
         System.out.println(map_t);
     }
   }  

    }