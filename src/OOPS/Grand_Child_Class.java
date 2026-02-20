package OOPS;

public class Grand_Child_Class extends Child_Class{


    public Grand_Child_Class(int x){
        super(x);
        System.out.println("I am grandchild contructor");

    }

    public static void main(String[] args) {

        Grand_Child_Class C2= new Grand_Child_Class(15);
        
    }

}
