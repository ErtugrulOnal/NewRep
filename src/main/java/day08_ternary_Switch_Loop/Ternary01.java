package day08_ternary_Switch_Loop;

public class Ternary01 {
    public static void main(String[] args) {
        //Example 1: Type code to select the minimum one of two integers


        int a = 12;
        int b = 7;

        int r1=a<b ? a:b;

        System.out.println(r1);

        //Example 2 . if two integers are pozitif return the multiplication otherwise
        // return " Can not multply"
        // 3 and 4 ==> 1    -    -3 and - can not multiply

        int d = -3;
        int e = 4;

       Object m= d>0 && e>0 ? d*e : " can not multiply";

        System.out.println("m = " + m);



    }
}
