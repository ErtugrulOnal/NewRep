package Day05_DT_StringManipulations;

public class StringManipulations01 {
    public static void main(String[] args) {

        //Type code to check if the seventh character of a given String is"a"
        String s = "Alabama State";
        boolean result1 = s.charAt(6) == 'a';
        System.out.println("result1 = " + result1);

        boolean result2 = s.startsWith("a", 6);
        System.out.println("result2 = " + result2);

        // Type code to check if a string ending with "money" or not

        String t = "Learn Java earn money";

        //1st way: Substring

        boolean result3 = t.substring(t.length() - 5).equals("money");
        System.out.println("result3 = " + result3);

        //2.way: endsWth()

        boolean result4 = t.endsWith("money");
        System.out.println("result4 = " + result4);

        //Type code to convert "money" into "dollar"
        String result5 = t.replace("money", "dollar");
        System.out.println("result5 = " + result5);

        //Example: Delete all "y" from a given string

        String dd = "Everyting is easy if you study";
        String newS = dd.replace("y", "");
        System.out.println("dd = " + dd);
        System.out.println("newS = " + newS);

        //Example: delete all the digits (0,1,2,3,4,5,6,7,8,9) from a given string
        //[0-9] ==> regular expression for numbers in java
        // 1. so for all digits ==> [0-9]
        // 2. all lowercases ==> [a-z]
        // 3. all Uppercases ==> [A-Z]
        // 4. all letters ==>[a-zA-Z]
        // 5. all letters and digits [a-zA-Z0-9]
        // 6. all vowels ==>[aeiouAEIOU]
        // 7. All punctuiation marks ==>\\p{Punct}
        // 8. All characters "different from" [^]
        // 9. All characters different from small letters [^a-z]
        //10. all characters diefferent from all letters [^a-zA-Z]
        //all caharacters dofferent from all vowels [^aeiouAEIUO]

        String mm= "Tom is 13 years old, and his GPA is 3.98";
        String mmm = mm.replaceAll("[0-9]", "");

        //Example: delete all vowels from a given string
        String u= "Tom are you here?";
        String newU= u.replaceAll("[aeiouAEIOU]","");
        System.out.println(newU);

        //count how many letters are there in a string
        //delete all characters from letters
        //count the remaining characters

        String k = "Tom  are you here?";
        int numK = k.length();
        System.out.println("numK = " + numK);

        int numOfLetters= k.replaceAll("[^a-zA-Z]","").length();
        System.out.println("numOfLetters = " + numOfLetters);

        // Check users password according to the given rules

        //Password should not have "space" Character
        // must have at east 1 upper case
        // must have at least 1 lower case
        //must have at least one symbol
        //must have at least one digit

        // Password should have at least 8 characters
        String pass= "As1?  fdes§";

        boolean ifBigger = pass.length()>7;

        //Password should not have "space" Character
        boolean ifNoSpace = pass.replaceAll("[^ ]", "").length()==0;
        System.out.println("ifNoSpace = " + ifNoSpace);//false bcs there are spaces

        // must have at east 1 upper case
        boolean thirdRule = pass.replaceAll("[^A-Z]","").length()>0;
        System.out.println("thirdRule = " + thirdRule);

        // must have at least 1 lower case
        boolean fourthRule = pass.replaceAll("[^a-z]","").length()>0;
        System.out.println("fourthRule = " + fourthRule);

        //must have at least one symbol (not letter, not digits)

        boolean fifthRule= pass.replaceAll("[a-zA-Z0-9]", "").length()>0;
        System.out.println("fifthRule = " + fifthRule);

        //must have at least one digit
        boolean sixthRule= pass.replaceAll("[^0-9]", "").length()>0;
        System.out.println("sixthRule = " + sixthRule);

    }


}
