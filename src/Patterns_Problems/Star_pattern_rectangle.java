package Patterns_Problems;

public class Star_pattern_rectangle {

    public static void main(String[] args){

        int rows=4;
        int col=4;

        for(int i=0;i<rows;i++){

            for(int j=0;j<col;j++){
                if(i==0||i==rows-1||j==0||j==col-1){
                 System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
           
        }

      
    }

}
