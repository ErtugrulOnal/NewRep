package day04StringManipulations;

public class StringManiplations02 {

    public static void main(String[] args) {
        //Example1: Get the 4 characters from a give string and convert them to lower cases.

        // Albania ==> Alba==>alba

        String example= "           Albania";

        String example1 = example.trim().substring(0,4).toLowerCase();
        System.out.println("example1 = " + example1);

// Question: Why dont we use "==" to compare strings?
//1st Scenario: "==" and equals() give you the same "True" output
        String r = "Java";
        String w = "java";

        boolean sameOrNot= r==w;
        System.out.println("sameOrNot = " + sameOrNot);//false values and addresses are different

        boolean same = r.equals(w);
        System.out.println(same); //false because values are different

        boolean sameIgnorCase = r.equalsIgnoreCase(w);
        System.out.println(sameIgnorCase); //true

//2nd Scenario: "==" and equals() give you the same "True" output

        String s1 = "Techpro";
        String s2 = "Techpro";

        boolean ifSameDoubleEquals = s1==s2;
        System.out.println("ifSameDoubleEqual = " + ifSameDoubleEquals);//true bcs values and adresses are the same

        boolean ifSameEquals = s1.equals(s2);
        System.out.println("ifSameEquals = " + ifSameEquals);//true bcs values are the same

//3rd Scenario: "==" and equals() give you different outputs

        String g1 ="Essek";
        String g2 = new String("Essek");

        boolean ifSameDoubleEqualSign = g1==g2;
        boolean ifSameEquals1         = g1.equals(g2);

        System.out.println("ifSameDoubleEqualSign = " + ifSameDoubleEqualSign); //false because values are the same but addresses are different
        System.out.println("ifSameEquals1 = " + ifSameEquals1);//true because values are the same.


    }
}
