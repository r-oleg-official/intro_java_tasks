package main.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Seminar01Task04_v2 {
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

        int indLeft = 0;
        int indRight = s.length() - 1;
        boolean check = false;

        for(int i = 0; i < s.length(); i++) {
            boolean lSymb = Character.isLetterOrDigit(s.charAt(indLeft));
            boolean rSymb = Character.isLetterOrDigit(s.charAt(indRight));
            if(lSymb == true) {
                if(rSymb == false) {
                    check = false;
                    for (int j = (s.length() - 1); j > 0; j--) {
                        while (rSymb == false) {
                            rSymb = Character.isLetterOrDigit(s.charAt(indRight--));
                        }
                    }
                }
                if(rSymb == true) check = true;
            }
        }
        return check;
    }
}
