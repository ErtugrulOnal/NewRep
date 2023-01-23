package day07IfStatementternaryStatement_Loops;

public class Loop017 {
    public static void main(String[] args) {
        // Asagidaki sekli cizen bir kod yaziniz

        /*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5

        */

        for (int i=1 ; i<6   ;i++ ){

            for (int k=1 ; k<=i   ;k++ ){
                System.out.print(k+" ");

            }
            System.out.println();

        }

    }

}
