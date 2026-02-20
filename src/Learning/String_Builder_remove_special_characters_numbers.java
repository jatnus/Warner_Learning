package Learning;

public class String_Builder_remove_special_characters_numbers {

    public static void main(String[] args) {

        String s="jatin123@";

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

         }

        
        
    }

