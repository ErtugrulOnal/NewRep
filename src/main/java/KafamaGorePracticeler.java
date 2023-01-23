import java.util.Scanner;

public class KafamaGorePracticeler {

    public static void main(String[] args) {

        //Example 1: 1 isci isi 10 gunde bitiriyor
        //           2 isci calisacak
        //           isin bitme suresi 5 gundur

        Scanner scan = new Scanner(System.in);

        System.out.println("Bir isci isi kac gunde bitiriyor?");
        double isBitr = scan.nextDouble();

        System.out.println("Toplam kac isci calisacak");
        int isciSayisi = scan.nextInt();

        double isKacGundeBiter = isBitr / isciSayisi;
        System.out.println(isciSayisi + " isci ile " + isKacGundeBiter + " gunde is biter");

        // 'a' index numarasi 'A' dan buyuk olup olmadigini yazdiriniz

        char kucukA = 'a';
        char buyukA = 'A';

        System.out.println("a, A'dan buyuk mudur? :" + (kucukA > buyukA));

        char space = 'm';
        System.out.println("space = " + (space + 0));

        int harf3 = 'm';
        System.out.println("harf3 = " + harf3);

        //TASK: Kullanicidan alacaginiz iki sayiyi yine kullaniciya
        // sectireceginiz dort islemden biri ile isleme koyup sonucu yazdiriniz

        Scanner scan1 = new Scanner(System.in);

        System.out.println("Yapmak istediginiz islem tipini seciniz: " +
                           "\n Carpma icin: 1 \n Bolme icin: 2 \n Toplama icin: 3 \n Cikarma icin: 4 \n giriniz" );
        int islem = scan1.nextInt();

        System.out.println("Lutfen iki adet sayi giriniz");

        double sayi1= scan1.nextDouble();
        double sayi2 = scan1.nextDouble();

        if (islem==1){
            System.out.println(+sayi1+"*"+sayi2 + "="+ (sayi1*sayi2));
        }else if (islem==2) {
            System.out.println(+sayi1+"/"+sayi2 + "="+(sayi1/sayi2));
        }else if (islem==3) {
            System.out.println(+sayi1+"+"+sayi2 + "="+(sayi1+sayi2));
        }else if (islem==4) {
            System.out.println(+sayi1+"-"+sayi2+ "="+(sayi1-sayi2));
        }else {
            System.out.println("Lutfen gecerli bir sayi giriniz");



        }
        int a = 5;
        int b= 2;
        double c = a/b;
        System.out.println("c = " + c); //2.0





    }
}
