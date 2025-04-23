package StringFormatting;

import java.util.Arrays;

public class StringFormatting {
    public static void main(String[] args) {
        String str="Samriddha";
        String str2=" Satyal";
        String str3=str.concat(str2);
        char myChar=str3.charAt(1);
        System.out.println(myChar);
        String sentence="Hello, my name is Samriddha";
        String[] words=sentence.split(" ");
        System.out.println(words[0]);
        System.out.println(Arrays.toString(words));
        System.out.println(str3.substring(0,5));
        System.out.println(sentence.contains("Sam"));
        System.out.println(sentence.indexOf("a"));
        System.out.println(sentence.lastIndexOf("a"));
        System.out.println(sentence.replace("a", "Ram"));

    }
}
