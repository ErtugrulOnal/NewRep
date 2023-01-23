package WhileLoops;

import java.util.Scanner;

public class WhileLoop_04 {
    public static void main(String[] args) {


        //Kullanicnin verdigi sayi icin carpim tablosunu olusturup consola yazdiran kodu yziniz
        //    ==>   3==> 3x1=3  3x2=6  3x3=9   3x4=12 ..... 3x10=30   <==
        Scanner scanner = new Scanner(System.in);
        System.out.println("carpim tablosu gormek icin bir sayi giriniz");
        int num = scanner.nextInt();

        int i= 1;

        while( i <11 ){
            System.out.print(num + "X" + i +"=" + (num*i) +" ");
            i++;
        }

    }
}
