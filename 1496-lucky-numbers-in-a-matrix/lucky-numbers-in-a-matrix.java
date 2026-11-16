import java.util.*;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        Set<Integer> rowMins = new HashSet<>();
        for (int i = 0; i < m; i++) {
            int minVal = matrix[i][0];
            for (int j = 1; j < n; j++) {
                minVal = Math.min(minVal, matrix[i][j]);
            }
            rowMins.add(minVal);
        }
        
        List<Integer> result = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            int maxVal = matrix[0][j];
            for (int i = 1; i < m; i++) {
                maxVal = Math.max(maxVal, matrix[i][j]);
            }
            if (rowMins.contains(maxVal)) {
                result.add(maxVal);
            }
        }
        
        return result;
    }
}
