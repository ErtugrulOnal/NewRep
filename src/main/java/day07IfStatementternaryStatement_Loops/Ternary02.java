package day07IfStatementternaryStatement_Loops;

import java.util.Scanner;

public class Ternary02 {

    public static void main(String[] args) {

        //Type code to check if a number has 3 digits or not, use ternary

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int num =scanner.nextInt();

        String digit = num>99 && num<1000 ? "Girdiginiz sayi 3 basamakli bir sayidir":
                                            "Girdiginiz sayi 3 basamakli degildir";
        System.out.println(digit);

        String digit1 = num/100>1 && num/100<10 ? "Girdiginiz sayi 3 basamakli bir sayidir":
                                             "Girdiginiz sayi 3 basamakli degildir";
        System.out.println("digit1 = " + digit1);

    }

}
