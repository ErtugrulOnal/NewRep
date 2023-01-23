package dy16multidimansionalArrays;

import java.util.Arrays;

public class Md02 {
    public static void main(String[] args) {
        //Example 1: Bir multidimensional array olusturup toplam eleman saysini consola yazdiriniz

        int b[][] = {{13, 33}, {31, 69, 77}, {41, 14, 44}, {69, 31, 99}, {3}};

        System.out.println(Arrays.deepToString(b)); // [[13, 33], [31, 69, 77], [41, 14, 44], [69, 31, 99], [3]]

        int sum = 0;

        for (int[] w : b
        ) {

            sum = sum + w.length;
        }
        System.out.println(sum); //12


    }
}
