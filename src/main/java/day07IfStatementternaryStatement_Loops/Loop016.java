package day07IfStatementternaryStatement_Loops;

import java.util.Scanner;

public class Loop016 {
    public static void main(String[] args) {

        /* Example:  Asagidaki ciktiyi verecek kodu yaziniz

        Week:1
        Day:1
        Day:2
        Day:3
        .......
        Week:2
        Day:1
        Day:2
        Day:3
        .......
        Week:3
        Day:1
        Day:2
        Day:3
        .......

        */

        for (int i = 1; i < 4; i++) {

            System.out.println("week : " + i);

            for (int k = 1; k < 4; k++) {
                System.out.println("day :" + k);

            }
            System.out.println();

            //Asagidaki sekli ekrana yazdiran kodu yaziniz

            //    ****
            //    ****
            //    ****

            Scanner scanner = new Scanner(System.in);
            System.out.println("Satir sayisini gir");
            int satir = scanner.nextInt();

            System.out.println("sutun sayisini gir");
            int sutun = scanner.nextInt();

            System.out.println("Karakter seciniz");
            char ch1 = scanner.next().charAt(0);


            for (int j = 1; j <= satir; j++) {


                for (int l = 1; l < sutun; l++) {

                    System.out.print(ch1);

                }
                System.out.println();

            }
            break;

        }


    }
}
