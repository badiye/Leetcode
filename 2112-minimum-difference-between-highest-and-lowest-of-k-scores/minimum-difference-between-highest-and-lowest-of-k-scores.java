import java.util.Arrays;

class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min = nums[k-1] - nums[0];
        for(int i=1; i<=nums.length-k; i++) { 
            if(nums[i+k-1]-nums[i] < min) {
                min = nums[i+k-1]-nums[i];
            }    
        }
        return min;
    }
}