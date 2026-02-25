package Collections;

public class WBD_Interviw {

    public static void main(String[] args) {

        // Input: I work for WBD and I like it

        // Output: it like I and WBD for work I

        // Input: I work for WBD and I like it!!

        //  Output: it like I and WBD for work I!!

      

          String s= "I work for WBD and I like it!!";

           i.contains("!!")

         String [] ar = new String[10]; 
        Class obj = new obj();
         obj.accessFlags(ar);
          

        //    ST.

              ar= s.split(" ");
           String temp;
          String Temp2= obj.accessFlags(temp);

              if(Temp2)
  
           for(int i=ar.length-1;i>=0;i--){
              temp= ar[i];

              
            //   if(i==0){
            //     System.out.print(temp);
              } else
              System.out.print(temp+" ");
           }


        
    }

}
StringBuilder nums= new StringBuilder();
         StringBuilder special= new StringBuilder();
          StringBuilder cr= new StringBuilder();


         for(char ch: s.toCharArray()){
            if(Character.isDigit(ch)){
                 nums.append(ch);

            }else if (Character.isLetter(ch)) {
                cr.append(ch);

            }else{
                special.append(ch);
            }

            }
            String letter =cr.toString();
            String numbers =nums.toString();
            String alpha =special.toString();
            System.out.println("########################");
           System.out.println(letter);
           System.out.println(numbers);
           System.out.println(alpha);