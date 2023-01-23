package Day15_Arrays;

import java.util.Arrays;

public class Arrays0 {
    public static void main(String[] args) {

        //Example: Bir arrayin icinde herhangi bir elemanin olup olmadigini
        //kontrol eden ve kac kere tekrarlandigini gosteren kodu yaziniz

        int a[] = {0, 2, 3, 0, 12, 0};

        int num = 15;

        int counter = 0;

        for (int w : a) {

            if (w == num) {

                counter++;

            }

        }
        if (counter > 0) {
            System.out.println("element " + num +" "+  counter + " defa dizide  kullanilmis");
        } else {
            System.out.println(num + " dizide kullnilmadi");
        }
    }
}