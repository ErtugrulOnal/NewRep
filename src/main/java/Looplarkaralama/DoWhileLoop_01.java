package Looplarkaralama;

import java.util.Scanner;

public class DoWhileLoop_01 {
    public static void main(String[] args) {
        //Kullanicidan bir tamsayi alinz
        /*
        Tamsayi 100 den kucukse "kaybettiniz" mesai versin
        100 den buyukse "kazandiniz" desin
         */
        Scanner scanner = new Scanner(System.in);
        int d = 0;

        do {
            System.out.println("Lutfen bir sayi giriniz");
            d = scanner.nextInt();
            if (d >= 100) {
                System.out.println("kazandiniz");
            }

        } while (d >= 100);
        System.out.println("kaybettiniz");

    }

}



