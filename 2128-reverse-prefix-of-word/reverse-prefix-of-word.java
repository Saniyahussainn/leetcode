class Solution {
    public String reversePrefix(String word, char ch) {
        int idx = word.indexOf(ch);
        if (idx == -1) {
            return word;
        }
        StringBuilder prefix = new StringBuilder(word.substring(0, idx + 1));
        prefix.reverse();
        prefix.append(word.substring(idx + 1));
        return prefix.toString();
    }
}
