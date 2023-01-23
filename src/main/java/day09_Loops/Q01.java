package day09_Loops;

public class Q01 {
    public static void main(String[] args) {

        //type code to select the minimum one of two integers

        int a = 35;
        int b = 5;
        int c = -5;

        int r2 = c < 0 ? -1 * c : c;

        System.out.println("Absolute value is; " + r2);

        //Example 3:If two integers are positive return the multiplication
        //         Otherwise, give a message like "I do not know how to multiply"
        //         3 and 4  ==> 12   -   -3  and -4 =>"I do not know how to multiply"

        int d = -3;
        int e = 4;

        Object m = d > 0 && e > 0 ? d * e : "I dont know how to multiply";
        System.out.println("m = " + m);

        //Type code to check if a number is positive or not
        int x = 0;
        Object res1 = x > 0 ? "positive" : x==0 ? " equal to 0":  "negative";
        System.out.println("res1 = " + res1);

        //Type code to check if an integer has 3 digits or not==> Boundary Value Analysis--> -1000,
        // -999, 100, -99, 0, 99, 999, 1000

        int s= -32;

        Math.abs(s);

        int absS= Math.abs(s);

        String res2 = absS>99 && absS<1000 ? "it has 3 digits" : "not meet the criteria";

        System.out.println("res2 = " + res2);


    }


}

