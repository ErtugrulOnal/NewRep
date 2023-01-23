package day14multidimensionalarraysarraylist;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {

        //Example 1 : Convert 2 dimensional array to 1 dimensional array
        // [[5, 3][9,8,7][5,3,9,8,7,]] ==> [5, 3, 9, 8, 7]

        int a[][] = {{5, 3}, {9, 8, 7,}};

        // 1. Step: Find the number of element in multidimensional array
        int sum= 0;

        for (int[] w : a) {
            sum = sum +w.length;

        }
        System.out.println(sum);

        // 2. Step: create a new 1 multidimensional array whose length is the same
        //        with number of elements in the multidimensional array.
        
        int b[]= new int[sum];
        
         // 3. Step: Transfer the elements from the multidimensional array to the 1 dimensional

        int idx=0;
        for (int [] w: a ) {

            for (int k:w ) {

                b[idx]=k;
                idx++;
            }
            
        }
        System.out.println(Arrays.toString(b));
    }
}
