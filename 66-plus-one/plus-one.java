class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length-1;
        if(digits[n]<9) {
            digits[n] += 1;
            return digits;
        }
        digits[n] = 0;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] != 9) {
                digits[i] +=1;
                return digits;
            }
            digits[i] = 0;
        }
        if(digits[0]==0) {
            int[] newdigits = new int[digits.length+1];
            newdigits[0] = 1;
            System.arraycopy(digits, 0, newdigits, 1, digits.length);
            return newdigits;
        }
    return digits;
    }
}