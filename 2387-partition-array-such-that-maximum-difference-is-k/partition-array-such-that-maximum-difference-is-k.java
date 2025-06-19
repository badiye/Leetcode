class Solution {
    public int partitionArray(int[] nums, int k) {
        int count = 1;
        Arrays.sort(nums);
        int min = nums[0];
        for(int i=1; i<nums.length; i++) {
            if(nums[i]-min>k) {
                count++;
                min = nums[i];
            }
        }
        return count;     
    }
}