package OOPS;

public class Child_Class extends Parent_Class{

    
     public Child_Class(int x){
        super(x);
        System.out.println("I am Child Class Contructor");

     }

     public void child_1(){
        System.out.println("I am child class method");
     }


    public static void main(String[] args) {

        Child_Class C1 = new Child_Class();
        // Parent_Class P = new Parent_Class(7);

        // P.Parent_1();

    }




}
