class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left=0, op=0, minOp=Integer.MAX_VALUE;
        for(int right=0; right<blocks.length(); right++) {
            if(blocks.charAt(right) == 'W') {
                op += 1;
            }
            while(right-left+1>=k) {
                minOp = Math.min(minOp, op);
                if(blocks.charAt(left) == 'W') {
                    op -= 1;
                }
                left++;
            }
        }
        
        return minOp;
    }
}