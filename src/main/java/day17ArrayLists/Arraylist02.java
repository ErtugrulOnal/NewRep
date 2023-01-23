package day17ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class Arraylist02 {
    public static void main(String[] args) {

        //Arraylist olustururken sag tarafa (constructor) Arraylist yazmak zorundasiniz
        //Ama sol tarafa ister "Arraylist" yain isterseniz "List" yazin farketmez.

        List<Character> initials = new ArrayList<>();
        initials.add('A');
        initials.add('B');
        initials.add('M');
        initials.add('B');

        //Bir Listte kac eleman oldugunu nasil anlariz?
        int numOfElement = initials.size();
        System.out.println(numOfElement);

        //Note: Arraylerden bahsederken "Length", Listlerken bahsederken "Size" kullanin.

        // Bir listten istenen bir eleman nasil alinir?
        char u = initials.get(2);
        System.out.println(u);

        //Verilen bir string listteki elemanlarin toplam karakter sayisini bulan kodu yaziniz

        List<String> cities = new ArrayList<>();
        cities.add("Ulan Batur");
        cities.add("Delhi");
        cities.add("Bogota");
        cities.add("Abidjan");

        //1.yol:
        int sum = 0;
        for (String w : cities) {
            sum = sum + w.length();

        }
        System.out.println("sum = " + sum);

        //2.yol:
        int toplam =0;
        for (int i=0 ;i<cities.size()  ;i++){

            toplam= toplam + cities.get(i).length();
        }
        System.out.println(toplam);

    }
}
