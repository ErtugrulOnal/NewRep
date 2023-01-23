package day12arrays_foreachloop;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        int [] numbers= new int[4];
        numbers [0]= 12;
        numbers [1]= 45;
        numbers [2]= 9;
        numbers [3]= 56;

        System.out.println(Arrays.toString(numbers));

        int minValues = numbers[0];
        for (int w: numbers){

            minValues=Math.min(minValues,w);
        }
        System.out.println(minValues);

    }
}
