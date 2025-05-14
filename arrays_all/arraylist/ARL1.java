package arrays_all.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ARL1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        //making arraylist from array

        // String[] strarr={"Max","Kev"};
        // ArrayList<String> list1=new ArrayList<>(Arrays.asList(strarr));

        list.add(7);
        list.add(8);
        list.set(0, 9);
        System.out.println(list);
        list.size();

        list.add(10);
        list.remove(0);  //index dine
        System.out.println(list);

        System.out.println(list.contains(8));
        System.out.println(list.indexOf(10));
    }
}
