package day10loops_Practices;

public class DoWhileLoop_01 {
    public static void main(String[] args) {
        //Example1: what sthe difference between ""While" and "doWhile" loops?
        // While Loop: Zero execution is possible

        int i= 1;

        while (i<1){
            System.out.println("I m while loop");
             i++;

        }
        //do while loop; Loop body excetues at least definitly once
        int k = 1;

        do{
            System.out.println("I am do-while Loop");
            k++;
        }while (k<1);
    }
}
