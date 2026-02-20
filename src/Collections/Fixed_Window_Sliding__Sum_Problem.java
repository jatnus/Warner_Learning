package Collections;

public class Fixed_Window_Sliding__Sum_Problem {

    public static void main(String[] args) {
        
   

    int[] k = {1,2,3,3,1,2};
     char[] c = {'r','t','u'};

     String r="Warner Bros";
     char[] n=r.toCharArray();
// fixed size of 2 integers with greatest sum in serial order
   int temp=0;
   int sum=0;
   int i = 0;
   int j=0;
   int max=0;  

   while(j<k.length){ 

         sum=sum+k[j];
     
        if(j-i+1<3){
             j++;
         max=  Math.max(max, sum);

        }else if(j-i+1==3){
            max=  Math.max(max, sum);
             sum= sum-k[i];
            i++;
            j++;
        }
    }
    System.out.println(max);
       
     }
   }
  

