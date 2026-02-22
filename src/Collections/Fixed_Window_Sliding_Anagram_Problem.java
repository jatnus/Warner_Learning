package Collections;

public class Fixed_Window_Sliding_Anagram_Problem {

    public static void main(String[] args) {
        
   

    int[] k = {1,2,3,3,1,2};
     char[] c = {'r','t','u'};

     String r="abbc";
     char[] n=r.toCharArray();
// fixed size of 2 integers with greatest sum in serial order
   int temp=0;
   int sum=0;
   int i = 0;
   int j=0;
   int max=0;  

           int[] cnt = new int[26];
        
        for (int b = 0; b < r.length(); b++){
          System.out.println(cnt[r.charAt(b) - 'a']++);

        }
       
     }
   }
  

