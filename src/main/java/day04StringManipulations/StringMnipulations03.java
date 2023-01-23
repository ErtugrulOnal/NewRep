package day04StringManipulations;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringMnipulations03 {
    public static void main(String[] args) {

        //Kullanicidan aldiginiz isimin ilk ve son harfini ekrana yazdiriniz
        // Ramazan==> Rn

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");

        //1. yol:

        String given = input.next();
        char firstLetter = given.charAt(0);
        char lastLetter = given.charAt(given.length() - 1);

        System.out.println("" + firstLetter + lastLetter);

        //2. yol:

        String firstLetter1 = given.substring(0, 1);
        String lastLetter1 = given.substring(given.length() - 1);

        System.out.println("" + firstLetter1 + lastLetter1);

        //Verilen stringdeki sadece hayvan isimlerini ekrana yazdiriniz
        //  "Ben kedi esim tavuk oglum  sever inek."

        String str = "Ben kedi esim tavuk oglum  sever inek.";
        String kedi = str.substring(4, 8);
        String tavuk = str.substring(14, 19);
        String inek = str.substring(33, 37);

        System.out.println(kedi + tavuk + inek);

        // Ilk isim ve soyismi iceren isimlerden ilk ve soyisimlerin bas harfleriniekrana yazdiriniz
        // Alev Kan ==>AK, Tahsin Turdakul==>TY

        System.out.println("Lutfen isim ve soyisminizi giriniz");

        String nameSurname = input.nextLine();
        String first1 = nameSurname.substring(0, 1);
        String last1 = nameSurname.split(" ")[1].substring(0, 1);
        System.out.println("" + first1 + last1);


    }
}
