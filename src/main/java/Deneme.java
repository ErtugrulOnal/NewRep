import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        System.out.println( 9000* 9 / 3);



        // Kullanicidn sayi isteyip deger olusturma uzerine

        // bu ornegimizde verilen sayilari toplayacagiz

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen ard arda 3 sayi veriniz");

        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();
        int sayi3 = input.nextInt();

        int sayiToplamlari = sayi1+sayi2+sayi3;

        System.out.println("sayiToplamlari = " + sayiToplamlari);


    }

    public static short ikiIslem (byte a, byte b, byte c) {

        return (byte) (a * b / c);


        }
    }
