package WhileLoops;

public class WhileLoop_01 {
    public static void main(String[] args) {
        // 3 ten 10 kadar tamsayilari consola yazdiriniz

        //1. yol


        for (int j = 3; j < 10; j++) {
            System.out.print(j + " ");
        }

        System.out.println();

        //2. yol
        int i = 3;

        while (i < 10) {

            System.out.print(i + " ");

            i++;
        }
    }
}