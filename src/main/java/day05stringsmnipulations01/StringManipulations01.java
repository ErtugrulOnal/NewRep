package day05stringsmnipulations01;

public class StringManipulations01 {

    public static void main(String[] args) {


        //Example1: Type code to check if the seventh character of a given String is "a" or not

        String s = "Alabama State";

        // 1st Way:
        boolean result1 =s.charAt(6)=='a';
        System.out.println("is the seventh character a? = " + result1);//true

       //2nd way:
        boolean result2 = s.startsWith("a",6);
        System.out.println("result2 = " + result2);


    }
}