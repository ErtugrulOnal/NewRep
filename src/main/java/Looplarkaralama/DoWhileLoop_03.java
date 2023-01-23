package Looplarkaralama;

import java.util.Scanner;

public class DoWhileLoop_03 {
    public static void main(String[] args) {
        /*

        username: admin
        password: pwd13

        Kllanicidan username ve password alin,
        username ve password dogru ise "hesabiniza hosgeldiniz"
        username ve password yanlis ise 3 kere "username ve password giriniz" mesaji versin.
        username ve password . kere yanlis girilirse "Hesabiniz bloke olmustur" mesai vererek islemi tamamlayiniz

         */
        Scanner scanner = new Scanner(System.in);
        int sayac = 0;


        do {
            if (sayac == 3) {
                System.out.println("Hesabiniz bloke olmustur");
                break;
            }

            System.out.println("Lutfen username giriniz");
            String username = scanner.next();

            System.out.println("Lutfen passwordunuzu giriniz");
            String password = scanner.nextLine();

            if (username.equals("admin") && password.equals("pwd123")) {
                System.out.println("Hesabiniza hosgeldiniz");
                break;

            }

            sayac++;

        } while (true);
    }
}


