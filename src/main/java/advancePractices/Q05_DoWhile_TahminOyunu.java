package advancePractices;

import java.util.Scanner;

public class Q05_DoWhile_TahminOyunu {



        //       0 ile 100 arasinda rastgele numara tahmini ypan bir kod yazin
        //ipucu: girdiginiz numara rastgele numaradan kucukse ==> daha buyuk bir sayi giriniz
        //       girdiginiz numara rastgele numaradan buyukse ==> daha kucuk bir sayi giriniz
        //       girdiginiz numara rastgele numaraya esitse ==> Tebrikler!!!  yazdiriniz

        public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sayi;

        int rastgeleSayi = (int) (Math.random()*100+1);
        System.out.println("rastgeleSayi = " + rastgeleSayi);

        do{
            System.out.println("0 - 100 arasi Bir sayi tahmini giriniz");
            sayi=scanner.nextInt();
            if(sayi==rastgeleSayi){
                System.out.println("Tebrikler!!!");
            }else if (sayi<rastgeleSayi){
                System.out.println("daha buyuk bir sayi giriniz");
            }else{
                System.out.println("daha kucuk bir sayi giriniz");

            }

        }while( sayi!=rastgeleSayi);


    }
}

