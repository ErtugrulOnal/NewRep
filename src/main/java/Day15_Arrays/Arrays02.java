package Day15_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //Example : Bir stringdeki sesli harflerin sayisini bulan kodu yazalim
        //    a - e - i - o - u - A - E - I - O - U

        String string1 = "Ay aksamdan isiktir yaylalar yaylalar ";

        // 1. yol: replace all kullanarak:

        int vowels = string1.replaceAll("[^aeiouAEIOU]", "").length();
        System.out.println(vowels);

        //2. yol: Array - Loop kullanarak

        String letters[] = string1.split("");
        System.out.println(Arrays.toString(letters));

        int counter = 0;
        for (String w : letters
        ) {
            switch (w.toLowerCase()) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter++;


            }


        }
        System.out.println(counter);
    }
}
