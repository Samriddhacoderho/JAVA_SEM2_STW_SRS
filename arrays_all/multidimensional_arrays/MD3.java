package arrays_all.multidimensional_arrays;

import java.util.Arrays;

public class MD3 {
    public static void main(String[] args) {
 int[][] arr=new int[2][2];

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.println("Enter array element:");
                arr[i][j]=2;
            }
        }

        System.out.println(Arrays.deepToString(arr));
    }
}
