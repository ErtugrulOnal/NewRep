package day04;

public class StringManipulations02 {

    public static void main(String[] args) {

        // Example1: Get the 4 characters from  string and convert them to lower cases
        //    Albania ===> alba

        String s = "Albania";
        s.substring(0,5).toLowerCase();

        String t = s.toLowerCase().substring(0,4); // or we can change te order of the methods.
        String m = s.substring(0,4).toLowerCase();

        System.out.println(t);

        //example02: Check if 2 strings are same or not

        String r = "Java";
        String u = "java";

        boolean same = r.equals(u);
        System.out.println(same);

        Boolean equalIgnorCase = r.equalsIgnoreCase(u);
        System.out.println(equalIgnorCase);

        //Why do we not use "==" to compare string values?

        String s1= "TechPro";
        String s2= "TechPro";

        boolean r1 =s1.equals(s2);
        System.out.println(r1); //true

        boolean r2= s1==s2;
        System.out.println(r2);//true

        String t1 = "Python";
        String t2 = new String("Python");

        boolean t3 = t1==t2;
        System.out.println(t3); //false

        boolean t4 = t1.equals(t2);
        System.out.println(t4); //true






    }


}
