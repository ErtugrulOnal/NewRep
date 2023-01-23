package day06StringManipulationsIfStatements;

public class StringManipulations003 {
    public static void main(String[] args) {

        //Example 1: Type code to check if a given string is empty or not
        // "Java" ==> false - "" ==> true

        //1.Way: Used length();
        String e = "dgdgd";
        boolean s1 = e.length() == 0;
        System.out.println("is the given string empty?  = " + s1);

        //1.Way: Used isEmpty() (recommended bcs if Java has a specicific method for a task we must prefer it );
        boolean s2 = e.isEmpty();
        System.out.println("is the given string empty?  = " + s2);

        //Type code to check if a given string is is containing ust "space character" or not
        //         "         " ==> True    -    "a   b     " ==> false

        String t = "        ";

        //1.Way:
        boolean s3 = t.replaceAll("[ ]", "").length() == 0;
        System.out.println("Is it containing ust space characer? = " + s3);

        //2.Way:
        boolean s4 = t.isBlank();
        System.out.println("Is it containing ust space characer? = " + s4);

        //Example 3 : Type code to oin multiple strings
        //        "Parkland" , "Miami", "USA" ==> ParklandMiamiUSA

        String P1 = "Parkland";
        String M1 = "Miami";
        String U1 = "USA";

        //1.Way:
        String result = P1+M1+U1;
        System.out.println("result = " + result);//ParklandMiamiUSA

        //2.Way:
        String result2= P1.concat(M1).concat(U1);
        System.out.println("result2 = " + result2);


    }
}
