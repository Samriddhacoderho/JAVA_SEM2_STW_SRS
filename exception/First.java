package exception;

public class First {
    public static void main(String[] args) {
        try {
            int data=5/0;
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
        finally
        {
            System.out.println("Finally block executed");
        }
    }
}
