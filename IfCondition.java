import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String str=sc.next();
        if(str.equals("Nepal"))
        {
            System.out.println("Your string was Nepal");
        }
        else
        {
            System.out.println("IDK What your string was");
        }
        sc.close();
    }
}
