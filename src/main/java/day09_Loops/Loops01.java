package day09_Loops;

public class Loops01 {
    public static void main(String[] args) {

        // Type code to print the letters from 'c' to 'u'
        //    ==> c d e f .............u

        for (char y = 'c'; y < 'v'; y++) {
            System.out.print(" " + y);


        }
        System.out.println();

        for (int x = 'c'; x < 'v'; x++) {
            System.out.print(" " + x);
        }

        System.out.println();

        //Type to print integers from 0 to 100 without using any number in your code

        for (int j = 'a'-'a' ;  j<'e' ; j++ ){

            System.out.print(" " + j);

        }
        System.out.println();

        for(char c = 'A' ; c<='z' ; c++){

            System.out.print(" "+ c);


        }
        System.out.println();

        // type code to find the sum of the integers from 3 to 7
        int sum =0;
        for (int i= 3 ; i<8 ; i++){

            sum +=i;

        }
        System.out.println("sum = " + sum);
    }
}