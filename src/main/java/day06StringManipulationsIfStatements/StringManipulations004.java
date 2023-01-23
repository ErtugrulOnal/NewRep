package day06StringManipulationsIfStatements;

public class StringManipulations004 {
    public static void main(String[] args) {
        //Type code to check if given string contains a specific character or characters
        //    "New York" ==> w --> true   -  York -->true   -  Xxx--> false

        String d = "New York";
        boolean rsult3 = d.contains(" Y o");
        System.out.println("does it contain the given character= " + rsult3);

        //Example 2 : Type code to change the first occurance of "java" to "phyton"
        // "java is Java, I like java" ==> "phyton is java, I like java"

        String f = "java is Java, I like java";

        String updatedString = f.replaceFirst("java", "phyton");
        System.out.println("updatedString = " + updatedString);

        String s = "Java";

        //Example 3: Type code to repeat a givrn string
        // "Java"  times ==> JavaJavaJavaJava

        String repeatS = s.repeat(4);
        System.out.println("repeatS = " + repeatS);
    }
}
