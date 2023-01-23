package day09_Loops;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
                 /*
           If the gender is "Male" and the age is less than 13 print "Boy" otherwise print "Man".
        If the gender is "Female" and the age is less than 13 print "Girl" otherwise print "Woman".
        If the gender is different from "Male" and "Female" print "No information".
        If you put another statement into an if statement you need to use 'nested if'
        //to prevent any difference cause any problem with the enterance of the data
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your gender pls");

        String gender = scanner.next().toLowerCase();

        System.out.println("Enter your age pls");
        byte age = scanner.nextByte();

        if (gender.equals("male")) {

            if (age >= 13) {
                System.out.println("boy");
            } else {
                System.out.println("Man");
            }
        } else if (gender.equals("female")) {

            if (age > 0 && age < 14) {
                System.out.println("Girl");
            } else {
                System.out.println("Woman");
            }

        } else {
            System.out.println("No information");
        }

        // Type code to find the sum of the digits of an integer
        //  584 ==> 5+8+4= 17  ==> %10 AND ORDINARY DIVISION BY 10

        int sum = 0;
        int number = 584;

    }
}
