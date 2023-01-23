package Practices01;

public class Q04 {
    public static void main(String[] args) {

        /*
        Create a String variable and find the sum of ASCII values of the first and the last characters of the String.
        String s= "Miami";
         */
        String m = "Malatya";

        int asci1= m.charAt(0);
        int asci2= m.charAt(m.length()-1);

        System.out.println("The ASCII value`s sum of both characters are : " + (asci1 + asci2));

        //1.Task: Count the alphabetical characters in a given value.

        String str= "Wow!...Ali is 13 years old and he is a university student!!!";

        int totalNumOfChar= str.length();

        String strWithoutPunct= str.replaceAll("\\p{Punct}","");

        System.out.println("strWithoutPunct = " + strWithoutPunct);

        int strWithoutPunctLength = strWithoutPunct.length();

        System.out.println("strWPLength = " + strWithoutPunctLength);

        int countOfAlphabeticalChars= str.replaceAll("[^A-Za-z]", "").length();

        System.out.println("countOfallAlphChar = " + countOfAlphabeticalChars);
    }
}
