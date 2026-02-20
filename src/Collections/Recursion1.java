package Collections;

public class Recursion1 {

    public static void main(String[] args) {

        Recursion1.recursion(5);

        
    }

    public static void recursion(int n){

         System.out.println(n);
        if(n==1){
            return;
        }
        n--;
       
        recursion(n);

    }





}
