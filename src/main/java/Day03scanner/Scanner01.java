package Day03scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[]args) {
        //Kullanicidan  data alip kodlarimizda kullanacagiz

        //Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz
        //i) Alanini hesaplayiniz
        //ii) Cevresini hesaplayiniz

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir diktorgen icin oncelikle kisa kenar olacak sekilde iki kenar uzunlugunu giriniz");
        double kisaKenar = input.nextDouble();
        double uzunKenar = input.nextDouble();

        double alanHesabi = kisaKenar*uzunKenar;
        double cevreHesabi = 2*(kisaKenar+uzunKenar);

        System.out.println("Alan  =  " +alanHesabi);
        System.out.println("Cevre =  " +cevreHesabi);


    }
}
