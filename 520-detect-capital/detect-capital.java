class Solution {
    public boolean detectCapitalUse(String word) {
        int countUpper = 0;
        
        // Count the number of uppercase letters in the word
        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                countUpper++;
            }
        }
        
        if (countUpper == word.length() || countUpper == 0) {
            return true;
        }
        
        return countUpper == 1 && Character.isUpperCase(word.charAt(0));
    }
}
