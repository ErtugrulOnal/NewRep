package Looplarkaralama;

public class WhileLoop_03 {
    public static void main(String[] args) {

        // verilen bir stringde hrfin sonrasina bir "*" ekleyecek kod yaziniz
        //    M*a*h*m*u*t*

        String kelime = "zabazingo";

        String yeniKelime = "";

        int i = 0;

        while (i < kelime.length()) {

            yeniKelime =yeniKelime + kelime.charAt(i) + "*";

            i++;
        }
        System.out.print(yeniKelime);

    }
}
