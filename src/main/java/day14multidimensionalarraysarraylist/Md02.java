package day14multidimensionalarraysarraylist;

import java.util.Arrays;

public class Md02 {
    public static void main(String[] args) {

        //Example: Type code to find the multiplication of all elements of multidimensional array
        // [[5,4], [10,6,3]] ==>3600

        int a[][] = {{10,11},{2,4,7,}, {10, 6, 6, 3}};

        int multiply = 1;

        for (int[] w : a) {

            for (int k : w) {

                multiply = multiply * k;

            }

        }
        System.out.println(multiply);

    }
}
