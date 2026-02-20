package Strings;

import java.util.Scanner;

public class Reverse_String_StringBuilder {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);


        char frontchar;
        char lastchar;
        
        StringBuilder sb= new StringBuilder(sc.next());

        for(int i=0;i<sb.length()/2;i++){
            
               int front=i;
                int last= sb.length()-1-i;

                frontchar=sb.charAt(front);
                lastchar=sb.charAt(last);

                sb.setCharAt(last, frontchar);
                sb.setCharAt(i, lastchar);

        }
        System.out.println(sb);

    }

}
