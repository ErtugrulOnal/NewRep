package day09_Loops;

import java.util.Scanner;

public class ForLoop_04 {
    public static void main(String[] args) {

        /*

        Kullanicidan baslangic ve bitis degerlerini alin.
        Baslangic degernden baslayip bitis degerine kdr aradki tum cift tamsayilari
        ekrana yazdiriniz  // 10 12 14 16.....

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("baslnagic degri giriniz");
        int baslangic = scanner.nextInt();

        System.out.println("bitis degri giriniz");
        int bitis = scanner.nextInt();

        if(baslangic>bitis){
            System.out.println("baslangic bitis sayisindan buyuk olamaz");
        }

        for(int i = baslangic ; i<=bitis     ;i+=44 ){
            if(i%2==0){
                System.out.print(i +" ");
            }
        }

    }
}
