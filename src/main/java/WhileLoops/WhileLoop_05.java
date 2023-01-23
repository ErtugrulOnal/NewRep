package WhileLoops;

public class WhileLoop_05 {
    public static void main(String[] args) {

        //Verilen bir stringde her harfin sonrasina bir "*" ekleyiniz
        // Java  ===> J*a*v*a

        String kelime= "Cikrikci Mahmut";
        int i=0;
        String  yeniKelime= "";
        while(i < kelime.length()){
            yeniKelime = yeniKelime + kelime.charAt(i) + "*";

            i++;
        }
        System.out.println(yeniKelime);

    }
}
