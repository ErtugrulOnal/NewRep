package day14multidimensionalarraysarraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {
        //Example 2; Type code to print the elements of a list if the elemnts is greater than the number of elements in the list
        // [5, 9, 3, 4, 6] ==>9 - 6

        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(9);
        nums.add(13);
        nums.add(4);
        nums.add(6);

        // 1. step: Find the number of list elements
        int numOfEl = nums.size();

        // 2. step: Check if an element is greater than the number of list elements then print.

        for (Integer w : nums) {

            if (w > numOfEl) {
                System.out.println(w + " ");

                // When you talk about Arrays use "Array's Length" when you talk about Lists use "List's Size"

            }
        }
    }
}
