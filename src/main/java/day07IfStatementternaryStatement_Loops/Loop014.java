package day07IfStatementternaryStatement_Loops;

public class Loop014 {
    public static void main(String[] args) {
        //Size verilen bir tamsayinin rakamlari toplamini bulunuz

        int num = 385;
        num = Math.abs(num);
        int sonuc = 0;

        int i;
        for (i = num; i > 0; i = i / 10) {

            sonuc = sonuc + i % 10;

        }
        System.out.println("sonuc = " + sonuc);

        //Exmple: size vrilen bir stringi ters ceviren kodu yaziniz

        //  "Kaba! ==> "abaK"
        String kaba = "Kalabalik";

        String ters ="";

        for (int k= kaba.length()-1; k>-1 ; k--){

            char c = kaba.charAt(k);

            ters = ters+c;

        }
        System.out.println("ters = " + ters);

    }
}
