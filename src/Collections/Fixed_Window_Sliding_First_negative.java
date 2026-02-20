package Collections;

import java.util.ArrayList;
import java.util.List;

public class Fixed_Window_Sliding_First_negative {

    public static void main(String[] args) {
        
   //find first negative intger in subarray of size 3

    int[] k = {-8, 2, 3, -6, 10};
     char[] c = {'r','t','u'};

     String r="Warner Bros";
     char[] n=r.toCharArray();
// fixed size of 2 integers with greatest sum in serial order
   int temp=0;
   int sum=0;
   int i = 0;
   int j=0;
   int max=0;  
   int m =2;
List<Integer> l1 = new ArrayList<>();
List<Integer> l2 = new ArrayList<>();
   while(j<k.length){ 
    if(k[j]<0){
        temp=k[j];
        l1.add(temp);
    }

     if(j-i+1<m){
        j++;
    }else if(j-i+1==m){

        if(l1.isEmpty()){
            l2.add(0);
        }else{
            l2.add(l1.getFirst());  
        } 
        if(k[i]==l1.getFirst()){
            l1.remove(0);
 
        }
         i++;
        j++;

    }
}System.out.println(l2);

    }
}
 