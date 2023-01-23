package Practices.practice01;

public class Q05_PrintingMumOneByOne {

    // Write a Java program to break an integer into a sequence of individual digits.
    // Hint: use /(division operator) and % (modulus operator)==>gives the remainder of a division operation)
    // x: input: 12345
    //    output: 1
    //            2
    //            3
    //            4
    //            5
    public static void main(String[] args) {

        int number =12345;
        int ones = number%10;
        System.out.println("ones = " + ones);

        int tens= (number/10%10);
        System.out.println("tens = " + tens);

        int hundreds=(number/100)%10;
        System.out.println("hundreds = " + hundreds);

        int thousands = (number/1000)%10;
        System.out.println("thousands = " + thousands);

        int tenThousands = (number/10000)%10;
        System.out.println("tenThousands = " + tenThousands);

        int num=12;
        int a = num%5;
        System.out.println("a = " + a);

        int b= num%3;
        System.out.println("b = " + b);


    }
}
