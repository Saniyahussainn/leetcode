class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        
        for (String sentence : sentences) {
            // Count the number of spaces and add 1 to get the word count
            int count = 1;
            for (char c : sentence.toCharArray()) {
                if (c == ' ') {
                    count++;
                }
            }
            maxWords = Math.max(maxWords, count);
        }
        
        return maxWords;
    }
}
