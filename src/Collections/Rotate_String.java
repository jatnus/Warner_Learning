package Collections;

public class Rotate_String {

    public static void main(String[] args) {

        String s= "abcde" ;       
        String goal = "ebcda";   
           String temp=s+s;

        if(s.length()!=goal.length()){
          System.out.println("false");
        }
         else if (temp.contains(goal)){
            System.out.println("true");
         }else{
            System.out.println("false");
         }

         }
    }

    



