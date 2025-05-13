package arrays_all.multidimensional_arrays;

import java.util.Scanner;

public class MDA1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[2][3];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println("Enter array element for array index:("+(i+1)+","+(j+1)+")");
                arr[i][j]=sc.nextInt();
            }
        }
        // System.out.println(Arrays.toString(arr[1]));  //Arrays.toString(arr);

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
