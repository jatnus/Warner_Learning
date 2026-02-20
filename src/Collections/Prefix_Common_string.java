package Collections;

public class Prefix_Common_string {

    public static void main(String[] args){
        // String[] Sr= {"flow","flew" ,"flower" };
      
        String  strs[] = {"flower","flow","flight"};
       if (strs == null || strs.length == 0) {
        System.out.println("not valid array");
       }
    
       String prefix = strs[0];
           for(int i=1;i<strs.length;i++){
              while (!strs[i].startsWith(prefix)) {
                prefix= prefix.substring(0, prefix.length()-1);
                if (prefix.isEmpty()){
                    System.out.println("no commom prefix");
                }
                
           }
           System.out.println(prefix);


    }

}
}