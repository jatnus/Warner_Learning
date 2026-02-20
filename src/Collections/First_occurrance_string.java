package Collections;

import java.util.ArrayList;
import java.util.List;

public class First_occurrance_string {

    public static void main(String[] args){
        String H= "sadbutsad";
        String N= "sad";
       int len=H.length()-N.length()+1;
       int temp=0;
       
       List<Integer> l= new ArrayList<Integer>();

       for (int i=0;i<len;i++){
            temp=i+3;
        if(H.substring(i, temp).equals(N)){
                l.add(i);
        }
       }if(l.isEmpty()){
        l.add(-1);
       } 
       System.out.println(l);

       }
          


    }

