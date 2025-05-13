package arrays_all;

import java.util.Arrays;

public class AccessElement {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("At position "+i+", element is:"+arr[i]);
        }
        Arrays.fill(arr, 0);  //sabai element lai 0 rakhdincha.
        System.out.println(Arrays.toString(arr));

        for(int x:arr)
        {
            System.out.println(x);
        }

        Arrays.sort(arr);  //esle chai ascending order ma sort gardine bhayo array lai.

        //yo mathi ko is like for i in arr garya python ma, basically a foreach loop. 

        //read about array methods sabai, copyOf, equals
    }    
}
