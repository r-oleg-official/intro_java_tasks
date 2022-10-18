import java.util.Arrays;

public class Seminar01Task02 {
    public static void main(String[] args){
        int[] nums = {3, 2, 2, 3};
        int rem = 3;
        System.out.println(removeElement(nums, rem));
    }
    public static int removeElement(int[] nums, int val){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val){
                count++;
                for(int j = i; j < (nums.length - 1); j++){
                    nums[j] = nums[j + 1];
                }
                //i--;
            }
        }
        return count;
    }
}
