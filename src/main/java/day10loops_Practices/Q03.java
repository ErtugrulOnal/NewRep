package day10loops_Practices;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

        //Type to get the outpt like
        /*

        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of Rows");
        int numOfRows = scanner.nextInt();

        System.out.println("Please enter the number of Rows");
        int numOfColumns = scanner.nextInt();

        for (int i = 1; i <= numOfRows; i++) {


            for (int k = 1; k < 6; k++) {

                System.out.println(k);
            }

            //Example 2: Type code to print odd integers from 12 to 67 in the same line with a space between them
            int k = 12;
            while (k < 68) {

                if (k % 2 != 0) {
                    System.out.println(k + "");

                }
                k++; //Do not forget increment part in while loop
            }
            System.out.println();

            //Example 3: Type code to find the sum of integers from 12 to 67

            int n = 12;
            int sum = 0;

            while (n < 67) {

                sum = sum + n;


                n++;

            }
        }

    }
}
