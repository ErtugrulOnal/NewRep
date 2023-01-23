package day07IfStatementternaryStatement_Loops;

import java.util.Scanner;

public class TernaryPractice012 {
    public static void main(String[] args) {
        //Kullanicidn final notunu "A", "B", "C" seklide girmesini isteyiniz
        //"A" ise "Cok basarili", "B" ise "Basarili" ve "C" ise de "Orta " yazdiriniz

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen final notunuzu giriniz");
        String not = scanner.next();


        String sonuc = not.equalsIgnoreCase("A") ? "Cok basarili" :
                not.equalsIgnoreCase("B") ? "Basarili" :
                        not.equalsIgnoreCase("C") ? "Orta" :
                                "Lutfen gecerli bir not \"a,b veya c\" giriniz";

        System.out.println(sonuc);


        // 3 ten 6 ya kadar tamsayilarin toplamini bulan kodu yaziniz

        int sum = 0;

        for (int i = 3; i < 7; i++) {

            sum = sum + i;

        }

        System.out.println(sum);


    }
}
