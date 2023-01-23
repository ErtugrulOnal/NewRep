package Looplarkaralama;

import java.util.Scanner;

public class DoLoop_01 {
    public static void main(String[] args) {
        // Kullanicin verdigi sayi icin bir carpim tablosu olusturunuz
        //  4 verdi ise 4X1 =4 4X=8 4X3=12 .....4X10=40 gibi

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 1 den 10 a kadar bir rakam giriniz");
        double rakam = scanner.nextDouble();
        int i=1;
        while (i< 11) {

            System.out.println(rakam + "X" + i + "=" + rakam * i);

            i++;

        }

    }
}
