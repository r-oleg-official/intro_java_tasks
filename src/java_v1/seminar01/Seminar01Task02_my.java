package java_v1.seminar01;

import java.util.Arrays;

public class Seminar01Task02_my {
    public static void main(String[] args) {
        int[] arr1 = new int[] {3, 2, 2, 3};
        int[] arr2 = new int[] {0, 1, 2, 2, 3, 0, 4, 2};
        int rem1 = 3;
        int rem2 = 2;

        System.out.println(removeElement(arr1, rem1));
        System.out.println(Arrays.toString(arr1));
        System.out.println(removeElement(arr2, rem2));
        System.out.println(Arrays.toString(arr2));
    }
    public static int removeElement(int[] nums, int val) {
        int tmp, count = 0;
        for(int i = 0; i < nums.length -1; i++) {
            if(nums[i] == val) {
                for(int j = nums.length - 1; j > i; j--) {
                    if(nums[j] != val) {
                        tmp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = tmp;
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static class Seminar01Task04_v3 {
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
}
