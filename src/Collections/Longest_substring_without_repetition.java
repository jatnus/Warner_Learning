package Collections;

import java.util.HashSet;

public class Longest_substring_without_repetition {

    public int lengthOfLongestSubstring(String s) {


        int maxlen=0;
        int strt=0;
        int count=0;

        char[]cr = s.toCharArray();

        // HashMap<Character,Integer> ch= new HashMap<>();

        // for(int end=0;end<s.length();end++){
        //        char curr= cr[end]; 
        //     if(ch.containsKey(curr)){
        //         strt=strt+1;

                
        //     }
        //     ch.put(curr,end);
        //     maxlen=Math.max(maxlen,end-strt+1);

        // }


        // use hashsets to do this, store unique elements in hashsets 
        // and if repeating character comes then pops out first character and repeat

        int i=0;
        int j=0;
        int max =0;

        HashSet<Character> S= new HashSet<Character>();

         while(j<cr.length){
            if(!S.contains(s.charAt(j))){
                S.add(s.charAt(j));
               max = Math.max(S.size(), max) ;
                j++;
            }else {
                S.remove(s.charAt(i));
                i++;
            }

         }

        return max;
        
    }


    public static void main(String[] args){
        String s="pwwkerdfwd";
      Longest_substring_without_repetition a =new Longest_substring_without_repetition();
      
      int t=a.lengthOfLongestSubstring(s);
      System.out.println(t);

    }
}

