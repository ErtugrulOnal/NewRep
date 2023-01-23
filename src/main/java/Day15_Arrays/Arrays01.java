package Day15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {

        // Example1: Kullanici ile beraber bir array olusturunuz

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sisteme Kac adet ogrenci gireceksiniz?");

        int numOfStd = scanner.nextInt();
        System.out.println("Girisi sonlndirmk icin Q tusuna basiniz");

        String[] stdNames = new String[numOfStd];

        for (int i = 1; i <= numOfStd; i++) {
            System.out.println("Lutfen" + i + ".nci ogrenciyi giriniz");


            String stdName = scanner.next();

            if (stdName.equalsIgnoreCase("q")) {
                break;
            }
            stdNames[i - 1] = stdName;
        }
        System.out.println(Arrays.toString(stdNames));
    }
}
