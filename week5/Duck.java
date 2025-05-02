package week5;

public class Duck {

    public static void main(String[] args) {
        String num="4602";
        boolean ansCheck=func_tasks(num);
        if(ansCheck)
        {
            System.out.println("Duck num");
        }
        else
        {
            System.out.println("Not Duck");
        }
    }

    public static boolean func_tasks(String num)
    {
        boolean ans=false;
        if(num.charAt(0)=='0')
        {
            ans=false;
        }
        else
        {
            for(int i=1;i<num.length();i++)
        {
            if(num.charAt(i)=='0')
            {
                ans=true;
                break;
            }
        }
        }
        return ans;
        
    }
}