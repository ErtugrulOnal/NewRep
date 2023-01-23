package dy16multidimansionalArrays;

public class Md06 {
    public static void main(String[] args) {


        //Bir multidimensional arraydeki en buyuk ve en kucuk sayinin toplamini yazdiriniz

        int[][] a = {{7, 4}, {8}, {11, 1, 45, -44, 69}, {31, 67}, {7}};

        int big = a[0][0];
        int small = a[0][0];

        for (int[] w : a) {

            for (int k : w) {

                big = Math.max(big, k);
                small = Math.min(small, k);
            }
        }
        System.out.println(small + big);
        System.out.println(big);


    }


}
