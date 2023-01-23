import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ifStatementKafamaGoreSorular {
    /*Kullancidan iki sayi isteyin

    sayilarin ikisi de pozitif ise "sayilarin toplamini",
    ikisi de negatif ise "carpimlarini,
    biri poz. digeri neg. ise "farkli isaretlerde sayilarla islem ypamazsin",
    sayilardan sifir olan varsa "sifir carpmaya gore yutan elemandir" yazdirin.

     */

    //Kullancidan iki sayi isteyin

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");



        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        String harf= scan.nextLine();

        if (sayi1!=(0-9)) {
            System.out.println("gecerli bir sayi giriniz");


        }

        //sayilarin ikisi de pozitif ise "sayilarin toplamini",

        if (sayi1 > 0 && sayi2 > 0) {
            double top = sayi1 + sayi2;
            System.out.println("top = " + top);

            // ikisi de negatif ise "carpimlarini,

        } else if (sayi1<0 && sayi2<0) {
            double carp= sayi1*sayi2;
            System.out.println("carp = " + carp);

            //biri poz. digeri neg. ise "farkli isaretlerde sayilarla islem ypamazsin",

        } else if (sayi1*sayi2<0) {
            System.out.println("farkli isaretlerdeki sayiarla islem yapamazsin");


        //sayilardan sifir olan varsa "sifir carpmaya gore yutan elemandir" yazdirin.

        } else if (sayi1*sayi2==0) {
            System.out.println("sifir carpmaya gore yutan elemandir");

        //varsayim disi herhangi bir durumda:

        }else {
            System.out.println("Lutfen gecerli bir sayi giriniz");
        }


    }

}
