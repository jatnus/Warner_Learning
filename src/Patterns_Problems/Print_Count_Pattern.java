package Patterns_Problems;

public class Print_Count_Pattern {

    public static void main(String[] args) {
        
   

     int rows=5;
      int count=0;

        for(int i=0;i<rows;i++){

            for(int j=0;j<i+1;j++){
                count=count+1;
                 System.out.print(count+" ");

            }
            
            System.out.println("");
           
        }

         }

}
