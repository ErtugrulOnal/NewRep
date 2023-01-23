package Looplarkaralama;

public class ForLoop_03 {
    public static void main(String[] args) {
        /* sekli ciziniz

        * * * *
        * * *
        * *
        *

        */

        int satir = 3;
        int sutun = 4;

        for (satir=1 ;satir<5 ;satir++ ){

            for (sutun= 4 ; sutun>=satir ;sutun--){

                System.out.print("*" + " ");
            }
            System.out.println();
        }


    }
}
