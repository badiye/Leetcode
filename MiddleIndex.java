class Solution {
    public int findMiddleIndex(int[] nums) {
        int middleIndex=0;
        while(middleIndex<nums.length){
            int leftsum = 0;
            int rightsum = 0;
            for(int i=0; i<middleIndex; i++) {
            leftsum+=nums[i];
            }
            for(int i=middleIndex+1; i<nums.length; i++) {
            rightsum+=nums[i];
            }
            if(leftsum==rightsum) {
                return middleIndex;
            }
            middleIndex++;
        } 
        return -1;   
    }
}