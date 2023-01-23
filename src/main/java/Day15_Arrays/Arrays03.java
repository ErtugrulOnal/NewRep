package Day15_Arrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        //Example: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz [2, 3, 12, 0, 0, 0]

        int a[]= {0,2,3,0,12,0};
        int b[]= new int[a.length];

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        int idx = 0;

        for (int w:a) {

            if (w!=0){
                b[idx]=w;
            idx++;

            }
        }
        System.out.println(Arrays.toString(b));
    }
}
