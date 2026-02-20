package Strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Substring_string_to_char {

//     Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.

public static void main(String[] args) {
      String s="aabbbcccc";

         char[] ar= s.toCharArray();
        //  String temp="";
        //   for (int i=0;i<s.length();i++){
        //      String temp="";
        //      for(int j=i+1;j<s.length();j++){
        //             char c=ar[j];
        //         if(temp.contains(c)){
        //             break; 

        //         }else 
           Map<Character,Integer> ch= new HashMap<Character,Integer>();
                  for(char a : ar){
                    if(ch.containsKey(a)){
                        ch.put(a, ch.get(  a)+1);
                    }else{
                        ch.put(a, 1);
                    }
                  }

                //   System.out.println(ch);

               Iterator<Character> I= ch.keySet().iterator();

               while (I.hasNext()){
                 char key= I.next();
                 int value= ch.get(key);
                 System.out.println("key-"+key +" , " +"value-"+value);


                 
               }
               }

                }
            

