package dy16multidimansionalArrays;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {

        //Multidimensional Array nasil olusturulur?
        int a[][] = new int[3][2];

        //Multid. Arrayler nasil yazdirilir

        System.out.println(Arrays.toString(a));//[[I@19dfb72a, [I@17c68925, [I@7e0ea639]

        System.out.println(Arrays.deepToString(a));//[[0, 0], [0, 0], [0, 0]]

        //Multid. arraylere nasil eleman eklenir?

        a[0][0] = 31;
        a[0][1] = 11;
        a[1][1] = 69;
        a[1][0] = 33;
        a[2][1] = 99;
        a[2][0] = 0;

        //Arraylere non-primitive data konulamaz.
        /*

        Arraylere primitive data veya referance konulur.
        Ama bir arrayi yazdirmak istedigimizde Java adresler yardimi ile non primitive dataya ulasir.
        ve o non-primitive datayi sanki arrayin icindeymis gibi gosterir.

        */
        //Multidimensional Arraylerdeki belli elemanlara nasil uasilir?

        System.out.println(Arrays.toString(a[2]));//[0, 99]
        System.out.println(a[2][1]); //99

        System.out.println(Arrays.toString(a[0]));//[31, 11]
        System.out.println(a[1][1]);//69


    }
}
