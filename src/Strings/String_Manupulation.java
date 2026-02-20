package Strings;

public class String_Manupulation {

    public static void main(String[] args){

     String ar[] = {"snow","is", "falling"};
        for(int i=ar.length-1;i>=0;i--){
            System.out.println(ar[i]);
    }
      String t = "Warner brother";
    StringBuilder sr = new StringBuilder(t);
      System.out.println(sr.reverse());

      String x ="I am learning";
      System.out.println(x.substring(2,6));

      System.out.println(x.startsWith("I"));



}

}
