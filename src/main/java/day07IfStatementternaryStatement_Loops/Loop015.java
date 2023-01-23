package day07IfStatementternaryStatement_Loops;

public class Loop015 {
    public static void main(String[] args) {


        // Bir stringdeki "m" karakteri haric tum karakterleri yazdiriniz
        //    "Andromeda"   ===> "Androeda"

        String s = "Andmrmomedam";


        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == 'm') {
                continue;

            }

            System.out.print(c);
        }
        System.out.println();

        //1 den 100 kadar 6 ile bolunenler haric tum tamsayilari ekrana yazdiriniz;

        for (int i= 1 ; i<100 ; i++ ) {

            if (i % 6 == 0) {
                continue;

            }
            System.out.print(" "+i);
        }
        System.out.println();

        //Size verlen stringdeki "m" den onceki karakterleri yazdiriniz
        //    "Luxemburg"  ==> "Luxe"

        String l = "Luxemburg";

        for (int i=0 ;i<l.length()  ; i++  ){

            char herbirKarakter=l.charAt(i);

            if(herbirKarakter=='m'){
                break;
            }
            System.out.print(herbirKarakter);


        }
    }

}
