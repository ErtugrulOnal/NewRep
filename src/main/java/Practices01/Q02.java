package Practices01;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {

//Ask user to enter an integer then print "Even" on the console if the number is even.
        Scanner scan = new Scanner(System.in);

        System.out.println("please enter an integer");

        int num = scan.nextInt();
        boolean checkedNum = num% 2 == 0;
        System.out.println("Is the number even: " + checkedNum);

        //Check a number if it is an odd or not

        Scanner scan1 = new Scanner(System.in);
        System.out.println(" Enter a digit to check if it is an odd number ");

        int checkOdd = scan1.nextInt();

        System.out.println("Is the number odd? " + (checkOdd%2!=0));





    }
}
