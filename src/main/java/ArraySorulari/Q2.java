package ArraySorulari;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {

        int arr[] = {2, 11, 0, 3, 7};
        Arrays.sort(arr);
        for (int i = 4; i > 0; i--) { // -- (azalan) oldugu icin yazdirdiginda buyukten kucuge yazar
            System.out.print(arr[i] + " "); // 11 7 3 2
        }
        System.out.println();

        int arr1[] = new int[3];
        System.out.println(arr1[1]);// 0

        arr1[0] = 11;
        arr1[1] = 12;
        System.out.println(Arrays.toString(arr1));// [11, 12, 0]


        int[] arr2 = {3, 2, 3, 4, 4, 3};
        int count = 0;
        for (int i = 0; i < arr2.length; i++) {

            if (arr2[i] == 3) {
                count++;

            }
        }
        System.out.print(count);

        System.out.println();


    }
}