package day04;

import java.util.Scanner;

public class StringManipulations01 {

    public static void main(String[] args) {

        // Example01: Get the full name of the user and make all the characters in upper case

        Scanner input =new Scanner(System.in);

        System.out.println("Please share your name and last name with me");

        String fullName = input.nextLine().toUpperCase();

        //toUpperCase() converts all characters to Upper cases

        System.out.println(fullName);

        //Example02: Get the full name of the user make all characters in upper cases and remove spaces
        // from the beginning to the end

        System.out.println("Please share your name and last name with me");
        String name = input.nextLine().toUpperCase().trim();

        //trim() removes the spaces before and from the end of the characters or words does NOT touch the
        // space in between the characters or words.

        System.out.println("name = " + name);


        //Example03: Get a string from te user, then count the number of the chracters in the string
        System.out.println("Enter a string...");
        String s = input.nextLine();
        int numOfChar= s.length();
        System.out.println("numOfChar = " + numOfChar);


    }
}
