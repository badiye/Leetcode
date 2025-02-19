class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        int prefix = 1;
        pre[0] = prefix;
        int[] suf = new int[n];
        int suffix = 1;
        suf[n-1] = suffix;
        int[] answer = new int[nums.length];
        for(int i=1; i<n; i++) {
            prefix *= nums[i-1];
            pre[i] = prefix;
        }
        for(int i=n-2; i>=0; i--) {
            suffix *= nums[i+1];
            suf[i] = suffix;
        }
        for(int i=0; i<n; i++) {
            answer[i] = pre[i] * suf[i];
        }        
        return answer;
    }
}