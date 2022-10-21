package main.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Seminar01Task04_replace_regex {
    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "  hello world  ";
        String s3 = "race a car";
        String s4 = " ";
        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
        System.out.println(isPalindrome(s3));
        System.out.println(isPalindrome(s4));
    }
    public static boolean isPalindrome(String s) {
        if(s == " ") return true;
        s = s.trim().toLowerCase();
        String res = "";
        if (s != null) {
            Pattern p = Pattern.compile("\\W+|\t|\r|\n");
            Matcher m = p.matcher(s);
            res = m.replaceAll("");
        }

        int j = res.length() - 1;
        boolean check = true;
        for(int i = 0; i < (res.length() / 2); i++) {
            if(res.charAt(i) != res.charAt(j)) check = false;
            j--;
        }
        return check;
    }
}
