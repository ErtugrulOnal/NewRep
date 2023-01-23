package day04StringManipulations;

import java.util.Scanner;

public class Scanner01_NightTime {
    public static void main(String[] args) {

        //get the initials of a name which contains first name and last name


        Scanner input = new Scanner(System.in);

        System.out.println("please share yor name with us");

        String name= input.nextLine().trim().toLowerCase().substring(3).concat("2");

        String name1 =name.toUpperCase();
        Character firstInitial = name1.charAt(0);
        Character secondInitial = name1.split(" ")[1].charAt(0);

        System.out.println("Initial is : " +firstInitial + secondInitial);

        String ifade1 = "Concat";
        String ifade2 = "Learning";

        String ifadeToplami = (ifade1+"\n" +ifade2);
        System.out.println(ifadeToplami);

        //Get a string from a user then count the number of characters in the string

        System.out.println("enter a string");

        String omg = input.nextLine();
        int lengthOfOmg=omg.length();
        System.out.println("lengthOfOmg = " + lengthOfOmg);


    }
}

