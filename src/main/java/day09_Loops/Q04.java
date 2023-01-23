package day09_Loops;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        // Type code to find the sum of the digits of an integer
        //  584 ==> 5+8+4= 17  ==> %10 AND ORDINARY DIVISION BY 10

        int sum = 0;

        int number = 584;

        number = Math.abs(number);//+584

        for (int i = number; i > 0; i /= 10) {

            sum = sum + i % 10;
        }
        System.out.println("sum = " + sum);


         /*

      Ask user how many fibonacci numbers he wants to see. Then type the code that prints
      these fibonacci numbers.
      Ex: if user enters 6 output will be 112358

       */

        Scanner scanner= new Scanner(System.in);
        System.out.println("How many fibonaci numbers to see");
        int n = scanner.nextInt();

        int fibo1 = 1;
        int fibo2 = 1;
        System.out.println(fibo1 + " ");
        System.out.println(fibo2 + " ");

        int fibonacci=0;
        for (int i=1 ;  i<n-1  ; i++){

            fibonacci=fibo1+fibo2;
            fibo1=fibo2;
            fibo2=fibonacci;

            System.out.println(fibonacci + " ");

        }
    }
}
