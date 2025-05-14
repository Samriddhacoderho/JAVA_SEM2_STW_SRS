package arrays_all.arraylist;

import java.util.ArrayList;

public class ARL3 {
   public static void main(String[] args) {
    ArrayList<Integer> arr=arr_List();
    System.out.println(arr.size());
   } 

   public static ArrayList<Integer> arr_List()
   {
    ArrayList<Integer> arr=new ArrayList<>();
    arr.add(2);
    arr.add(3);
    arr.set(1, 3);
    return arr;
   }
}
