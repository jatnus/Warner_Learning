package Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Sets_Hashsets {

    public static void main(String[] args) {
        
    


    Set<Integer> S = new HashSet<>();

      S.add(10);
      S.add(20);
      S.add(10);
      System.out.println(S);
       

      Map<String,String> mp = new HashMap();
      mp.put("Company_name", "WARNER BROS DISCOVERY");
      mp.put("Employee_name", "Jatin Gupta");
      mp.put("Employee_id", "jatin.gupta@wbd.com");

      Set Sn= mp.keySet();
            // Set<Map.Entry<String, String>> Sn =mp.entrySet() ;
            //   Set tn= mp.keySet();
               
            //  for(String St : mp.keySet()){
                
            //  System.out.println(mp.get(St));
            //  }


            Iterator I=Sn.iterator();
            while(I.hasNext()){
                System.out.println(mp.get(I.next()));
            }

    //             Map<Integer,String> mp = new HashMap();
    //   mp.put(1, "WARNER BROS DISCOVERY");
    //   mp.put(2, "Jatin Gupta");
    //   mp.put(3, "jatin.gupta@wbd.com");

    //   Set Sn= mp.entrySet();
            //  Iterator It= S.iterator();
            //    System.out.println(It.next());
            //   Set tn= mp.keySet();
               
            //  for(Integer St : mp.keySet()){
                
            //  System.out.println(mp.get(St));
            //  }



            int[] ar= new int[]{4,4,5,6,6,7,5,9,3,3,3,5};
             Map<Integer,Integer> m = new HashMap<Integer,Integer>();
int count=0;
              for(int temp:ar){
                if(m.containsKey(temp)){
                    // count=  count+1;
                    m.put(temp, m.get(temp)+1);
                }else{
                 m.put(temp,1) ;  

                }

              }

              System.out.println(m);

        

    
}
}
