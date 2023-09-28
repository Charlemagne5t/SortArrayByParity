import java.util.Arrays;

public class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right){
            while (nums[left] % 2 == 0 && left < right){
                left++;
            }
            if(left == right){
                break;
            }
            while (nums[right] % 2 == 1 && left < right){
                right--;
            }
            if(left == right){
                break;
            }
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }

        return nums;
    }
}
