package day06StringManipulationsIfStatements;

public class StringMniplations001 {
    public static void main(String[] args) {
        //Type code to find the index of first occurence of `a` in a given String
        // Alabama ==>

        String g = "Alabama";

        int indxA = g.indexOf('a');
        System.out.println("indxA = " + indxA);

        //Type code to find the index of the first occurence of 'java' in a given String
        // "java is easy to learn, java is common in the market, java is OOP" ==> 2

       String t = "java is easy to learn, java is common in the market, java is OOP";

       //IndeOf("java") will give you the index of first character of thr first occurence of "java"

        int idxJava= t.indexOf("java");
        System.out.println("idxJava = " + idxJava);

        //Note: If you use "non-existing character or characters" in indexOf() method, it wil give you "-1"
        t.indexOf("Mary");

        //Note: indexOf() method can be used with  ""char" and "String" data types.

        // Example 3: Type code to find the index of the last occurence of 'm' in a given string
        //   Miami ==> 3

        //last index of 'm' will give you the index of the last occurence of 'm'
        String s= "Miami";
        int idxM = s.lastIndexOf('m');
        System.out.println("m = " + idxM);

        //Example 4: Type code to find the index of the last occurence of 'earn' in a given string
        // "Lern Java earn money" ==> 11

        String v = "Learn Java earn money";
        int indxEarn= v.lastIndexOf("earn");

        System.out.println("indxEarn = " + indxEarn);

        int minus= v.lastIndexOf('X');
        System.out.println("minus = " + minus);//-1

        //Note 1 : If you use "non-existing character or characters" in indexOf() method, it wil give you "-1"
        //Note 2 : indexOf() method can be used with  ""char" and "String" data types.

        //Example 5: Type code to check if a given character is unique or not in a given string.
        //       miami ==> 'a' --> Unique - 'i'--> Not unique


        //data:
        String y = "miami";
        char ch = 'a';

        //Seperate "data" and the "main code"

        //code:
        boolean r1= y.indexOf(ch)==y.lastIndexOf(ch);
        System.out.println("is the character unique?  = " + r1);




    }
}
