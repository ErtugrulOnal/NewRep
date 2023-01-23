package dy16multidimansionalArrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //Example 1: Create an integer array and print elements less than 10 on the console.
        int ages[] = new int[7];
        ages[0] = 13;
        ages[1] = 6;
        ages[2] = 19;
        ages[3] = -8;
        ages[4] = 10;
        ages[5] = 2;
        ages[6] = 87;

        //1. way:
        for (int w : ages) {

            if (w < 10) {
                System.out.print(w + " ");//6 -8 2
            }

        }
        //2.way:

        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages)); //[-8, 2, 6, 10, 13, 19, 87]
        for (int w : ages) {

            if (w >= 10) {

                break;
            }else {

            }
            System.out.print(w + " ");
        }

    }
}
