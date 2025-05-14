package arrays_all.multidimensional_arrays;

import java.util.Scanner;

public class MD2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[4][5];

        for(int i=0;i<4;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.println("Enter array element:");
                arr[i][j]=sc.nextInt();
            }
        }
        evenArray(arr);
        sc.close();
    }

    static void evenArray(int[][] arr)
    {
        System.out.println("The even elements are:");
        for (int[] row : arr) {
            for(int element:row)
            {
                if(element%2==0)
                {
                    System.out.print(element+",");
                }
            }
        }
    }
}
