package ArraySorulari;

import java.util.Arrays;

public class Q5_ArraylerdeSpesifikElemanBulma {
    public static void main(String[] args) {

        int arr[] = {1, 23, 12, 2, 3};
        // 12 nin arrayin elemani olup olmadigini kontrol etmek icin hangi kod yazilmalidir?

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));// 1,2,3,12,23
        System.out.println(Arrays.binarySearch(arr, 12)); //


        int arr3[] = {12, 23, 2, 3, 3};
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.binarySearch(arr3,5));
    }
}