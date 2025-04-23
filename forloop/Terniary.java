package forloop;

public class Terniary {
    public static void main(String[] args) {
        int i=2,j=2;
        int sum1=5+ ++i;  //++i ma chai first ma i ko value update huncha 2 bata 3, ani balla sum1=5+3=8 store huncha
        int sum2=5+ j++;  //j++ ma chai first ma sum2 ko kam huncha, sum2=5+2=7, ani balla j  ko value badcha. 
        System.out.println(j);
        System.out.println(sum1+"and "+sum2);
    }
}


