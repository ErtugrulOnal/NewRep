package day09_Loops;

import java.util.Scanner;

public class ForLoop02 {
    public static void main(String[] args) {
        //asagidaki sekli cizen kodu yaziniz

        /*

        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5

         */
        Scanner scanner= new Scanner(System.in);
        System.out.println("satir (row) adedini giriniz");
        int row= scanner.nextInt();


        for(int i =1 ; i<=row ; i++){

            for(int k=1 ; k<=i ;k++){
                System.out.print(k +" ");
            }
            System.out.println();
        }

    }
}
