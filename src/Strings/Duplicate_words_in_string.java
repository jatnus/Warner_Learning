package Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Duplicate_words_in_string {

    public static void main(String[] args) {
        
    

    String s = "java is java best is language java";

    Map<String,Integer> map= new HashMap<>();
        int count=0;
           String[] sr = s.split(" ");

             for(String temp: sr){
              if(map.containsKey(temp)){
                count++;
                map.put(temp,count);  //or  map.get(temp)+1
              }else{
                map.put(temp,1);
              }

    }
    System.out.println(map);
 System.out.println("************************************");
    Set<String> set= new HashSet<String>();

           set=  map.keySet();
           for(String key:set){
              System.out.println(key + " "+ map.get(key));
           }

    }

}
