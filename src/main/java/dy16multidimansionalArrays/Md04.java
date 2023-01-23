package dy16multidimansionalArrays;

import java.sql.Array;
import java.util.Arrays;

public class Md04 {

    public static void main(String[] args) {


        // Bir Multidimensional array olusturup bir boyutlu arraye donusturunuz

        // [[2, 5], [4, 7, 11], [3]] ==> [2, 5, 4, 7, 11, 3]


        int[][] a = {{2, 5}, {4, 7, 11}, {3}};
        System.out.println(Arrays.deepToString(a));

        //"a" arrayindeki toplam eleman sayisini bulunuz

        int totalElement = 0;

        for (int[] w : a) {
            totalElement = totalElement + w.length;


        }
        //"b" isimli tek boyutlu bir array olusturalim

        int[] b = new int[totalElement];

        System.out.println(Arrays.toString(b));

        //"a" arrayindeki elemanlari "b" arrayine transfer ediniz

        int idx = 0;

        for (int[] w : a) {

            for (int k : w) {

                b[idx] = k;

                idx++;
            }

        }System.out.print(Arrays.toString(b));


    }
}

