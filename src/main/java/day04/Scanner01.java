package day04;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        //Example: Get the initial of a name which contains first and last name
        //   Tom Hanks

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name and last name please");

        String fullName= input.nextLine(); //Tom Hanks
        char first = fullName.charAt(0);
        char last= fullName.split(" ")[1].charAt(0);
        System.out.println(first + " " + last);

    }
}
