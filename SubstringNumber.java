class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int k=0;
        for(int i=0; i<patterns.length; i++) {
            if(word.contains(patterns[i])) {
                k++;
            }
        }
        return k;
    }
}