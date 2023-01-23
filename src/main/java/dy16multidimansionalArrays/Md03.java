package dy16multidimansionalArrays;

public class Md03 {

    // Example 2: Bir tane integer multidimensional Array olusturunz. Bu arraydeki tum
    // sayilarin toplamini veren kodu yaziniz

    public static void main(String[] args) {

        int sum = 0;

        int a[][] = {{2, 62, 82}, {3, 13}};
        for (int[] w : a) {

            for (int k : w) {
                sum = sum + k;

            }

        }
        System.out.println("sum = " + sum);

    }
}