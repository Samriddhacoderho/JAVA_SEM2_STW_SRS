package revision;

public class StringAll {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello"); // naya memory reference create huncha
        String str4 = "hello"; // string pool se reference paucha
        // so total memory reference 3 huncha
        System.out.println(str1 == str2); //reference check garcha
        System.out.println(str1.equals(str4));  //value check garcha
        System.out.println(str1 == str3); // false, because str3 is a new object in heap memory
        System.out.println(str1.equals(str3)); // true, because the content is the same
    }
}
