package Looplarkaralama;

import java.util.Scanner;

public class WhileLoop_02 {
    public static void main(String[] args) {

        //verilen bir tamsayinin rakamlari toplamini yazdiriniz

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli bir syi giriniz ");

        int a= scanner.nextInt();
        int sum =0;

        while (a>0){
            sum = sum+ a%10;

            a/=10;

        }
        System.out.println("sum = " + sum);

    }
}
