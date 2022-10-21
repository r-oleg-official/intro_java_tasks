package main.java;

public class Seminar01Task04_v3 {
    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "  hello world  ";
        String s3 = "race a car";
        String s4 = " ";
        String s5 = ",; W;:GlG:;l ;,";
        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
        System.out.println(isPalindrome(s3));
        System.out.println(isPalindrome(s4));
        System.out.println(isPalindrome(s5));
    }
    public static boolean isPalindrome(String s) {
        boolean check = true;
        if(s == "  ") return check;
        s = s.trim().toLowerCase();
        String resStr = "";

        for(int i = 0; i < s.length(); i++) {
            boolean Symb = Character.isLetterOrDigit(s.charAt(i));
            if(Symb == true) {
                resStr = resStr + String.valueOf(s.charAt(i));
            }
        }

        int indRight = resStr.length() - 1;

        for(int i = 0; i < (resStr.length() / 2); i++) {
            if(resStr.charAt(i) != resStr.charAt(indRight)) check = false;
            indRight--;
        }
        return check;
    }
}
