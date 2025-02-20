import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int c = candies.length;
        List<Boolean> result = new ArrayList<>();
        int max = candies[0];
        for(int i=1; i<c; i++) {
            if(candies[i]>max) {
                max = candies[i];
            }
        }
        for(int i=0; i<c; i++) {
            if(candies[i]+extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
}