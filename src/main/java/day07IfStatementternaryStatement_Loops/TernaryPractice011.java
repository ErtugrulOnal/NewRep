package day07IfStatementternaryStatement_Loops;

import java.util.Scanner;

public class TernaryPractice011 {
    public static void main(String[] args) {
//Kullanicidn sifirdan buyuk bir tamsayi girmesini isteyin. Girilen pozitif tamsayi
// 3 basamakli ise "3 basamakli" yazdirin. 3 basamakli degilse cift olup olmadigini
// kontrol edin. Cift ise " 3 absamakli olmayan cift " yazdirin. Cift degilse
// "3 basamakli olmayan tek sayi" yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi1 = scanner.nextInt();



        String new1 = sayi1 > 0 ? (sayi1>99 && sayi1<1000) ? "3 basamakli pozitif bir sayi"
                                                           : (sayi1%2==0)                   ?      "3 basamakli olmayan cift sayi":
                                                                                                   "3 basamakli olmayan tek sayi" :
                                "Ltfen gecerli bir sayi giriniz";

        System.out.println(new1);

    }


}
