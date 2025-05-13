package arrays_all;

import java.util.Arrays;

public class ReturnArray {
 public static void main(String[] args) {
    int[] arr={1,2,3,4,5,6,7};
    System.out.println(lengthArray(arrayMethod(arr)));
 }  
 
 static int[] arrayMethod(int[] arr)
 {
    return arr;
 }

 static int lengthArray(int[] arr)
 {
    return arr.length;
 }

 static void printArray(int[] arr)
 {
    System.out.println(Arrays.toString(arr));
 }
}
