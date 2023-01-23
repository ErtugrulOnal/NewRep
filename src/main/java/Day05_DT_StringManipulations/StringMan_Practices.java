package Day05_DT_StringManipulations;

public class StringMan_Practices {
    public static void main(String[] args) {

        //Bir stringdeki tum "a" harflerini "A" ya ceviriniz.
        String req = "Ankaranin tasina gozlerimin yasina bak";

        String updated = req.replaceAll("a", "A");

        System.out.println("updated = " + updated);

        //Bir stringdeki "kara" keliemelerinin yerine "*" koyunuz

        String sentence = "Kara kara dusunme Ankara ";
        String updated1 = sentence.replaceAll("kara", "*");
        System.out.println("updated1 = " + updated1);

        //Bir stringdeki tum syilari "*" a ceviriniz
        // ornek:     "AC202117004" ==> "AC********"

        String studId = "AC202117004";

        String noNum = studId.replaceAll("[0-9]", "*");
        System.out.println("noNum = " + noNum);

        //Verilen bir stringde kullnilan noktalama isareti ve rakamlar ve space karakteri
        // haric tum karakterlerin sayisini bulan kodu yaziniz

        // "Ali 13 yasinda, dersem inanma!..."

        String y = "Ali 13 yasinda, dersem inanma!...";

        int kalanY = y.replaceAll("\\p{Punct}", "").
                replace(" ", "").
                replaceAll("[0-9]", "").
                length();

        System.out.println("kalanY = " + kalanY);

        



    }
}
