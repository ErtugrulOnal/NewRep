import java.util.Scanner;

public class GenelKaralama {
    public static void main(String[] args) {

         /*
           If the gender is "Male" and the age is less than 13 print "Boy" otherwise print "Man".
        If the gender is "Female" and the age is less than 13 print "Girl" otherwise print "Woman".
        If the gender is different from "Male" and "Female" print "No information".
        If you put another statement into an if statement you need to use 'nested if'
        //to prevent any difference cause any problem with the enterance of the data
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your gender,please");
        String gender = input.next().toLowerCase();


        System.out.println("enter your age,please");

        int age = input.nextInt();

        String s = gender.equalsIgnoreCase("Male") ? (age < 13 ? "boy" : "man") :
                gender.equalsIgnoreCase("Female") ? (age < 13 ? "girl" : "woman") : "No information";

       // if (s.equals("male" ")){


        }

       // System.out.println("s = " + s);
    }




