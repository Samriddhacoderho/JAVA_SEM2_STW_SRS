package arrays_all;

import java.util.Arrays;

public class BasicSyntaxofArray {
    public static void main(String[] args) {
        // //Syntax 1:
        int[] arr=new int[5];

        // //Syntax 2:
        int[] arr2;
        arr2=new int[5];

        // //Syntax 3:
        int[] arr3={4,3,1,6,3};

        // //Syntax 4:
        int[] arr4=new int[] {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));

    }
}
