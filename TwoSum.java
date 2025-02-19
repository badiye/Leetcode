import java.util.HashMap;
import java.util.Map;

class Solution {
    public Map<Integer, Integer> createHash(int[] arr) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int n=0; n<arr.length; n++) {
            hashMap.put(arr[n], n);
        } 
        return hashMap;
    }
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = createHash(nums);

        for (int i = 0; i < nums.length; i++) {
            int j=target-nums[i];
            if (hashMap.containsKey(j) && hashMap.get(j)!=i) {
                return new int[] {i, hashMap.get(j)};
            }
        }
        return null; // or throw an exception if no pair is found
    }
    public static void main(String[]args) {
        Solution s = new Solution();
        int[] arr = {4, 5, 6};
        System.out.print(s.twoSum(arr, 9));
    } 
}