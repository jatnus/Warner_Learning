package Collections;

import java.util.ArrayList;

public class Returning_Even_numbers_fromList {


    public static void main(String[] args) {

        int[] num = new int[]{3,5,7,8,12,5,4};
  ArrayList<Integer> L = new ArrayList<Integer>();
        

        for(int k : num){
            if(k%2==0){
             L.add(k);
            }
        }

        System.out.println(L);
     
      
        
    }

}
