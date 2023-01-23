package practice04;

public class Q02Forloop {
    public static void main(String[] args) {


        //Type code to print the integer divisible by 4 and by 6 from 13 to 211.
        for (int i = 13; i < 212; i++) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        //2. way :

        int i = 13;

        while (i < 212) {

            if (i % 4 == 0 && i % 6 == 0) {

                System.out.print(i + " ");


            }
            i++;
        }
    }
}