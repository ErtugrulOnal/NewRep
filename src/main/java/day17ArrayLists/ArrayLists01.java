package day17ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists01 {
    public static void main(String[] args) {
        /*

        1. Arraylistler (List) coklu data depolamak icin kullanilir
        2. Arraylistler (List) non-primitive data tipindeki coklu datalari depolamak icin kullanilir.
           Listler non-primitive datakabul ederler. Arrayler ise primitive data veya reference kabul eder.
        3. Arrayalistleri (List) olusrurken icine koyacaginiz eleman sayisini basta soylemeye gerek yoktur.
           Listler eleman sayisinda flexible dirlar ama Arrayler flexible degildir.
        4. Nicin Java Arrayleri iptal etmedi?
           i) Eleman sayisi belli olan datalari depolamak icin Arrayler tercih edilir.
           ii) Arrayler cok hizli calisir.
           iii) Arrayler memory de cok az yer kaplar
         */

        //List nasil olusturulur?

        ArrayList<Integer> ages = new ArrayList<>();
        System.out.println(ages);//[]

        //Arraylere nasil eleman eklenir?
        // Liste eleman eklemek icin add() methodunu kullaniriz
        //add() methodu elemanlari sizin verdiginiz sirada "List" e ekler. (Insertion Order)

        ages.add(12);
        ages.add(9);
        ages.add(1);

        ages.add(3, 666);
        ages.add(2, 7);// 2. indexe eger 2 de varsa saga kaydirip yerine koyar.

        System.out.println(ages);

        //Liste coklu eleman nasil eklenir?
        //Bir Liste coklu eleamn eklemek icin veya baska bir liste eklemek icin o elemanlari once bir listin icine koymalisiniz

        ArrayList<Integer> hallu = new ArrayList<>();

        hallu.add(4);
        hallu.add(11);
        hallu.add(31);

        ages.addAll(hallu);
        System.out.println(ages);// [12, 9, 7, 1, 666, 4, 11, 31]

        ages.addAll(2, hallu);
        System.out.println(ages);// [12, 9, 4, 11, 31, 7, 1, 666, 4, 11, 31]

        //Bir listteki tum elemnlari nasil silebilirim?
        ages.clear();
        System.out.println(ages); //[]

        //contains methodu bir elemanonin Listte olup olmadigini kontrol eder.
        boolean r = ages.contains(12);

        //Bir listin baska bir list ile ayni olup olmadigini kontrol etmek icin
        // iki listin esit olabilmesi icin ayni indexte ayni elemanlar olmalidir.

        ArrayList<String>names1= new ArrayList<>();
        names1.add("mahmut");
        names1.add("rifki");
        names1.add("callu");
        ArrayList<String>names2= new ArrayList<>();
        names1.add("mahmut");
        names1.add("callu");
        names1.add("rifki");

        //Example: verilen iki integer Listte tamamiyla ayni elemanlarin olup olmadigini kontrol eden kodu yaziniz

        ArrayList<Integer> saylar1 = new ArrayList<>();

        saylar1.add(4);
        saylar1.add(31);
        saylar1.add(11);
        ArrayList<Integer> saylar2 = new ArrayList<>();

        saylar2.add(4);
        saylar2.add(11);
        saylar2.add(31);

        Collections.sort(saylar1);
        Collections.sort(saylar2);

        boolean t = saylar1.equals(saylar2);
        System.out.println("t = " + t);


    }
}
