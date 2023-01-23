package day09_Loops;

import java.util.Scanner;

public class Loop_TersUcgen {
    public static void main(String[] args) {
        //Example 1: Asgidaki sekloi cizdiren kodu yziniz
        /*

        * * * * *
        * * * *
        * * *
        * *
        *

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("satir sayisini giriniz");
        int satir = scanner.nextInt();


        for(int i=1 ;i<=satir   ;i++ ){

            for (int k= satir ; k>=i ;k-- ){

                System.out.print("* ");
            }
            System.out.println();
        }



    }
}
