package day04StringManipulations;

public class StringManipulations03_NT {
    public static void main(String[] args) {



    /*

    Example 1 : Check the password if it complies to the given rules

                1.) It should start with "J"
                2.) It should have at least 8 characters
                3.) Last 3 characters should be "AVA"

     */
        String pass= "J12!?AVA";

        // 1.) It should start with "J"

        boolean firstLetter = pass.startsWith("J");
        System.out.println(firstLetter);

        // 2.) It should have at least 8 characters

        boolean atLeastEightChar= pass.length()>7;
        //There are "comparison operators" in Java: "==", "<", ">", "<=", ">=", "!=!
        //When you use comparison operators, you will get boolean returns.


        System.out.println(atLeastEightChar);

        // 3.) Last 3 characters should be "AVA"

       boolean ifCompliesThird= pass.substring(5).equals("AVA");
       // it starts searching from the 5th character to the end
       // we can also specify an ending character to search like (5,8)

        System.out.println(ifCompliesThird);

        //CharAt() ==> char
        //toUpperCase ==> String
        //toLowerCase() ==> String
        //trim() ==> String
        //Split() ==> String
        //length() ==> int
        //substring(beginning index, ending index) ==> String
        //substring(beginning index (it goes to the end from entered beginning index) ) ==> String
        //equals() ==> boolean
        //equalsIgnoreCase() ==> boolean
        //startsWıth() ==> boolean




    }

}
