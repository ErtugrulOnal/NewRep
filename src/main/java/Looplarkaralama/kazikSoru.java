package Looplarkaralama;

public class kazikSoru {
    public static void main(String[] args) {

//From a given array find all pairs whose sum is a given number.
//If the array is {4, 6, 5, -10, 8, 5, 20} and the number is 10 then output will be
//4+6=10, 5+5=10, -10+20=10

        Integer arr[] = { 16, 5, -10, 8,10, 5, 15, 4};
        int num = 20;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == num) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + num);
                }
            }
        }
    }
}