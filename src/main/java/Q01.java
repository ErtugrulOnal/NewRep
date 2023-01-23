public class Q01 {
    public static void main(String[] args) {

        //Type code to print the integers divisible by 4 and 6 from 13 to 211.

        int m = 13;
        while (m < 212) {
            if ((m % 4 == 0) && (m % 6 == 0)) {

           }
            m++;
            System.out.print( m + " ");
        }
    }
}