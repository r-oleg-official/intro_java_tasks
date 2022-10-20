package main.java;

import java.util.Arrays;

public class Seminar01Task02 {
    public static void main(String[] args) {
        //int[] arr1 = new int[] {3, 2, 2, 3};
        int[] arr2 = new int[] {0, 1, 2, 2, 3, 0, 4, 2};
        //int rem1 = 3;
        int rem2 = 2;

        //System.out.println(removeElement(arr1, rem1));
        //System.out.println(Arrays.toString(arr1));
        System.out.println(removeElement(arr2, rem2));
        System.out.println(Arrays.toString(arr2));
    }
    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}
