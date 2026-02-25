package Collections;

public class Rotate_String {

    public static void main(String[] args) {

        String s= "abcde" ;       
        String goal = "ebcda";   
           String temp=s+s;

        // if(s.length()!=goal.length()){
        //   System.out.println("false");
        // }
        //  else if (temp.contains(goal)){
        //     System.out.println("true");
        //  }else{
        //     System.out.println("false");
        //  }

        //  }
String st="";
String k="";

       StringBuilder b= new StringBuilder(s+s);
         int rotations=1;
        while(rotations>0){
                 s= s.charAt(s.length()-1) + s.substring(0,s.length()-1);
                 System.out.println(s);
            rotations--;
            }
            System.out.println(st);
        }
    }

    



