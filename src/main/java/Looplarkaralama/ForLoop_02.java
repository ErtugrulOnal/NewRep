package Looplarkaralama;

public class ForLoop_02 {
    public static void main(String[] args) {

        //sekli ciiniz
        /*

        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5

        */
        int satir =8;

        int sutun=8;

        for (satir=1 ; satir<8 ; satir++){

            for (sutun=1 ; sutun<=satir ; sutun++){

                System.out.print(sutun + " ");
            }
            System.out.println();
        }


    }
}
