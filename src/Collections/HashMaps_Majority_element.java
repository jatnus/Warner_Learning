package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMaps_Majority_element {

    public static void main(String[] args) {

           int[] test = new int[]{1,3,1,5,1,3,5,1};
          List<Integer> l = new ArrayList<>();

           Map<Integer,Integer> map = new HashMap<>();

           for(int temp: test){
            int count=0;
            if(map.containsKey(temp)){
                count=map.get(temp);           // 9/4 = 2
                map.put(temp,count+1);
                System.out.println(map);
               
            }else
            {
               map.put(temp, 1);
            }

           }
           

           System.out.println(l);

        
    }

 
    }
