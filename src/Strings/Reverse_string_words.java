package Strings;

public class Reverse_string_words {

    public static void main(String[] args) {
        
        String S=" Hello World  tree ";
        String t = S.trim();
        System.out.println(t);
        String reverse="";

        String ar[]= t.split(" ");

        for (int i=ar.length-1;i>=0;i--){
                if(i!=0){
             reverse= reverse + ar[i]+" ";
            }else
            reverse=reverse +ar[i];
            
        }

        System.out.println(reverse);
    }
}


