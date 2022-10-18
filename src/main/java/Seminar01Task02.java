package main.java;

import java.util.Arrays;

public class Seminar01Task02 {
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
}
