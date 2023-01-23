package Looplarkaralama;

public class ForLoop_04 {
    public static void main(String[] args) {
        //Kullanicidan baslangic ve bitis degerlerini alip aradaki tum cift syilari yazdiriniz
        int bas = 22;
        int bit = 65;

        int i = bas;
        int k = bit;
        int sum = 0;

        if (bas > bit) {
            System.out.println("Baslangic bitisten buyuk olamaz");
        } else {


            while (i < k) {
                if (i % 2 == 0)
                    System.out.print(i + " ");
                sum = sum + i;
                i++;
            }
            System.out.println();
            System.out.println("sum = " + sum);

        }
    }
}
