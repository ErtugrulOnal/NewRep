package day06StringManipulationsIfStatements;

import java.util.Scanner;

public class Ifstatement001 {
    public static void main(String[] args) {
        /*

        If you study hard, you will get offer soon

         */

        //Example: If a number is positive, print positive on the console
        int a = -1;

        if (a > 0) {
            System.out.println("a is positive");

        } else if (a == 0) {
            System.out.println("a is neutre");

        } else {
        }
        {
            System.out.println("a is negative");
        }

        //Example  : Type code that prints daynames for the given day numbers
        //    1 ==> Sunday +, 2 ==> Monday, ..... 7 ==> Saturday

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter day number to day name");
        byte dayNum = scan.nextByte();

        if (dayNum == 1) {
            System.out.println("Sunday");
        } else if (dayNum == 2) {
            System.out.println("Monday");
        } else if (dayNum == 3) {
            System.out.println("Tuesday");
        } else if (dayNum == 4) {
            System.out.println("Wednesday");
        } else if (dayNum == 5) {
            System.out.println("Thursday");
        } else if (dayNum == 6) {
            System.out.println("Friday");
        } else if (dayNum == 7) {
            System.out.println("Saturday");
        } else {
            System.out.println("Please select the valid numbers (1-7)");



        }
    }
}