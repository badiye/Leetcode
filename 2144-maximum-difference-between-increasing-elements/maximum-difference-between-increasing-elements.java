class Solution {
    public int maximumDifference(int[] nums) {
        int difference = -1;
        int min = nums[0];
        for(int i=1; i<nums.length; i++) {
            if(nums[i]>min && nums[i]-min>difference) {
                difference = nums[i] - min;
            } else if(nums[i]<min) {
                min = nums[i];
            }
        }
    
    return difference;
    }
}