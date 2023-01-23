package day07IfStatementternaryStatement_Loops;

public class Ternary01 {

    //Type code to check if  number is even or odd by using ternary mode
    public static void main(String[] args) {


        int num = 22;
        if (num % 2 == 0){
            System.out.println("Result = Even");
        } else System.out.println("Result = Odd");


        //              Condition          Executed if true        Executed if false
        String result = num % 2 == 0    ?     "Even"            :         "Odd";

        System.out.println("result = " + result);

    }
}