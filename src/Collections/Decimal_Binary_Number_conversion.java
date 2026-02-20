package Collections;

import java.util.ArrayList;
import java.util.List;

public class Decimal_Binary_Number_conversion {

    public static void main(String[] args) {

        int x = 10;
        List<Integer> l = new ArrayList<>();

int temp;


        while(x>1){
               temp= x;
               //temp = x%2;
               x=x/2;
               temp=temp%2;
                l.add(temp);

        }l.add(x);
    
        System.out.println(l.reversed());
    
    }

}
