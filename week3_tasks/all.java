package week3_tasks;
import java.util.Scanner;

public class all {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // Que6();
        // Que5();
        season();
    }

    public static void Que6()
    {
        char character=Character.toLowerCase(sc.next().charAt(0));
        if(character=='a' || character=='e' || character=='i' || character=='o'|| character=='u')
        {
            System.out.println("It was a vowel");
        }
        else
        {
            System.out.println("It was a consonant");
        }
    }

    public static void Que5()
    {
        System.out.println("Enter year:");
        int year=sc.nextInt();
        if (year%400==0)
        {
            System.out.println("It is a leap year.");
        }
        else if((year%4==0)&&(year%100!=0)) {
            System.out.println("It is a leap year.");
        }
        else {
            System.out.println("It is not a leap year.");
        }
    }

    public static void Que4()
    {
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Odd Number");
        }
    }

    public static void season()
    {
        System.out.println("Enter anything between 1 and 12(closed interval):");
        int num=sc.nextInt();
        switch(num)
        {
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Winter");
                break;
            case 3:
                System.out.println("Winter");
                break;
            case 4:
                System.out.println("Spring");
                break;
            case 5:
                System.out.println("Spring");
                break;
            case 6:
                System.out.println("Spring");
                break;
            case 7:
                System.out.println("Summer");
                break;
            case 8:
                System.out.println("Summer");
                break;
            case 9:
                System.out.println("Summer");
                break;
            case 10:
                System.out.println("Fall");
                break;
            case 11:
                System.out.println("Fall");
                break;
            case 12:
                System.out.println("Fall");
                break;
            default:
                System.out.println("JPT Number");
        }
    }
}