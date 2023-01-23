package dy16multidimansionalArrays;

public class Md05 {

    public static void main(String[] args) {


        // Bir multidimensional array olusturup bu arraydeki
        // elemanlarin carpimini consola yazdiriniz

        int a[][] = {{1, 3}, {2, 4}, {3, 5}};

        int carpim = 1;
        int idx = 0;

        for (int[] w : a) {

            for (int k : w) {

                carpim = carpim * k;
            }
        }
        System.out.println("carpim = " + carpim);
    }
}

