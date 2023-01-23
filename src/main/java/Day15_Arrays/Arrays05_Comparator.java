package Day15_Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.ToIntFunction;

public class Arrays05_Comparator {
    public static void main(String[] args) {
        //Example 1: String Array elemanlarini uzunluklarina gore kucukten buyuge siralayiniz
        //["Michael", "Ajda", "Thomas", "Tom"] ==> ["Tom","Ajda","Thomas","Michael"]

        String s[]= {"Michael", "Ajda", "Thomas", "Tom"};

        Arrays.sort(s, Comparator.comparingInt(String::length));

        System.out.println(Arrays.toString(s));

        //Example 2: String Array elemanlarini uzunluklarina gore buyukten kucuge siralayiniz
        //["Michael", "Ajda", "Thomas", "Tom"] ==> ["Michael", "Thomas", "Cuneyt","Ajda","Tom" ]

        String s1[]= {"Michael", "Ajda", "Thomas", "Tom", "Cuneyt"};
        Arrays.sort(s1,Comparator.comparingInt(String::length).reversed());
        System.out.println(Arrays.toString(s1));

        //Example 3: String Array elemanlarini uzunluklarina gore buyukten kucuge siralayiniz
        //Ayni karakter sayisinda olanlari da alfabetik siraya koyunuz
        // ["Michael", "Ajda", "Reyhane", "Gabriel", "Thomas", "Tom", "Ali", "Cin", "Cuneyt", "Cem"] ==>
        // ["Gabriel", "Michael", "Reyhane",  "Cuneyt","Thomas", "Ajda", "Ali", "Cem", "Cin", "Tom" ]

        String s2 []= {"Michael", "Ajda", "Reyhane", "Gabriel", "Thomas", "Tom", "Ali", "Cin", "Cuneyt", "Cem"};
        System.out.println(Arrays.toString(s2));

        Arrays.sort(s2,Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(s2));
    }
}
