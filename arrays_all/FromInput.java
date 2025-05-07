package arrays_all;

import java.util.Arrays;
import java.util.Scanner;

public class FromInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];

        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Enter a number for position "+i+":");
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.println("At element "+i+" Element is:"+arr[i]);
        }

        //Alternatively, array ko elements esari pani access garna sakincha, in a single line of code:
        System.out.println(Arrays.toString(arr));
    }
}


