package Collections;

import java.util.HashMap;

public class Longest_substring_without_repetition {

    public int lengthOfLongestSubstring(String s) {


        int maxlen=0;
        int strt=0;
        int count=0;

        char[]cr = s.toCharArray();

        HashMap<Character,Integer> ch= new HashMap<>();

        for(int end=0;end<s.length();end++){
               char curr= cr[end]; 
            if(ch.containsKey(curr)){
                strt=strt+1;

                
            }
            ch.put(curr,end);
            maxlen=Math.max(maxlen,end-strt+1);

        }

        return maxlen;
        
    }


    public static void main(String[] args){
        String s="abcadbcbb";
      Longest_substring_without_repetition a =new Longest_substring_without_repetition();
      
      int t=a.lengthOfLongestSubstring(s);
      System.out.println(t);

    }
}

