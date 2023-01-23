package WhileLoops;

import java.util.Scanner;

public class WhileLoop_03 {
    public static void main(String[] args) {

        //verilen bir sayinin rkamlari toplmini consola yazan kodu giriniz

        Scanner scanner = new Scanner(System.in);
        System.out.println("iki veya daha buyuk basmakli bir syi giriniz ");

        int sayi = scanner.nextInt();
        int sum = 0;


        // 1. yol

        while (sayi > 0) {

            sum = sum + sayi % 10;

            sayi /= 10;
        }
        System.out.println(sum);

        //2. yol for_loop:
        System.out.println("iki veya daha buyuk basmakli bir syi giriniz ");
        int a = scanner.nextInt();
        int toplam = 0;

        for ( int m=a ;m>0 ; m/=10){

            toplam=toplam+m%10;

        }
        System.out.println(toplam);
    }
}
