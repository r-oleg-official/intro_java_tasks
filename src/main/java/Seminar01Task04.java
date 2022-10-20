package main.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Seminar01Task04 {
    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        //String s2 = "race a car";
        //String s3 = " ";
        System.out.println(reverseWords(s1));
        //System.out.println(reverseWords(s2));
        //System.out.println(reverseWords(s3));
    }
    public static String reverseWords(String s) {
        s = s.toLowerCase();
        //s = String.valueOf(s);
        //System.out.println(s);
        for(int i = 0; i < s.length(); i++) {
            Character sym = s.charAt(i);
            String str = sym.toString() + ".+?" + sym.toString();
            Pattern pat = Pattern.compile(str);
            Matcher mat = pat.matcher(s);
            while(mat.find())
                System.out.println("Совпадение: " + mat.group());
        }
        //Pattern pat = Pattern.compile("e.+?d");
        //Matcher mat = pat.matcher("extend cup end table");

//        while(mat.find())
//            System.out.println("Совпадение: " + mat.group());
        return s;
    }
}
