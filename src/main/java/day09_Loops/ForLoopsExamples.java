package day09_Loops;

import java.util.Scanner;

public class ForLoopsExamples {
    public static void main(String[] args) {

        //Asagidaki gordugunuz sekli ekrana yazdiriniz

        /*

        ******
        ******
        ******

        */
        Scanner scanner =new Scanner(System.in);
        System.out.println("satir (row) sayisini giriniz");
        int row = scanner.nextInt();

        System.out.println("sutun(column) sayisini giriniz");
        int column = scanner.nextInt();

        for (int i=1 ;  i<=row ;i++ ){

           for(int k=1 ; k <= column  ;k++ ){
               System.out.print("* " );

            }
            System.out.println();
        }
    }

}
