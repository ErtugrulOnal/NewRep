package day04;

public class InterviewQuestion {

    public static void main(String[] args) {
        //Example: Type code to swap two integers
        // a=12 and b=5  ===> a=5 and b=12
        int a = 12;
        int b= 5;

        System.out.println(a+" "+b);

        int temp=0;

        //1st step:

        temp = a;

        //2nd step:

        a=b;

        // 3rd step:

        b=temp;

        System.out.println(a+ " " + b);

        //2nd way : do not create 3rd variable.

        int x=12;
        int y=5;

        System.out.println("Before swapping " + x +" " + y);

        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swapping " + x +" " +y);








    }
}
