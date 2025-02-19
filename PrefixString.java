class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder w = new StringBuilder();
        for(int i=0; i<words.length; i++){
            w.append(words[i]);
            if(w.toString().equals(s)) {
                return true;
            }
        }    
        return false;    
    }
}