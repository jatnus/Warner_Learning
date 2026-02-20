package Collections;

import java.util.Stack;

public class Valid_Paranthesis {

    public static void main(String[] args) {
         

    String s= "{[]";

    // int temp= 0;

       

    //    do {
    //         temp = s.length();
    //      s= s.replace("{}", "").
    //          replace("[]", "").
    //          replace("()", "");

    //            }   while(s.length()!= temp);

       
    //              System.out.println("##################");

    //     if(s.isEmpty()){
    //         System.out.println("String is Valid Paranthesis");
    //     }else{
    //         System.out.println("String is Invalid Paranthesis");
    //     }


    //    }
   
    // Using stack implementations
 
     Stack<Character> stack = new Stack<>();

        if (s.charAt(0) == '}' || (s.charAt(0) == ']') || s.charAt(0) == ')'){
            System.out.println("Invalid Parentheses");  
        }

        for(int i=0;i<s.length();i++){
         if (s.charAt(i) == '{' || (s.charAt(i) == '[') || s.charAt(i) == '(')  {
            stack.push(s.charAt(i));

         }else if (stack.size()==0) {
            System.out.println("Invalid Parentheses");
             
         }else if(((stack.lastElement()=='{') && (s.charAt(i)=='}'))||
            ((stack.lastElement()=='[') && (s.charAt(i)==']'))||
             ((stack.lastElement()=='(') && (s.charAt(i)==')'))){
               stack.pop();
             }
             else
                 {
              System.out.println("Invalid Parentheses");

             }
         }
         if (stack.empty()){

         System.out.println(" This is valid Parentheses");
         }
          else{
             System.out.println(" Invalid Parentheses");
          }  
         }
          
        }



// }


// }
