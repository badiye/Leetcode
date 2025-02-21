class Solution {
    public String reverseWords(String s) {
        String[] wordsArr = s.trim().split("\\s+");
        int left = 0;
        int right = wordsArr.length-1;
        while(left<right) {
            String temp = wordsArr[left];
            wordsArr[left] = wordsArr[right];
            wordsArr[right] = temp;
            left++;
            right--;
        }
        StringBuilder reversed = new StringBuilder();
        for(int i= 0; i<wordsArr.length; i++) { 
            reversed.append(wordsArr[i]);
            if(i!=wordsArr.length-1) {
                reversed.append(" ");
            }
        }
    return reversed.toString();
    }
}