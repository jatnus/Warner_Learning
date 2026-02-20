package Collections;

public class Recursion_Factorial {

    //n! = n*(n-1)*(n-2)
    //  int sum=0;

     public static void main(String[] args) {

       int ans= fact(5);
       System.out.println(ans);
         
     }



    public static int fact(int n){
       int sum=0;

        if(n==1|| n==0){
          return 1;
        }

        int x = fact(n-1);

            sum= n * x;
             return sum;

        }
       
    }



