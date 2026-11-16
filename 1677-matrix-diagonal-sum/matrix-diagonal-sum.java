class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            // Add primary diagonal element: mat[i][i]
            sum += mat[i][i];
            
            // Add secondary diagonal element: mat[i][n - 1 - i]
            // Skip the center element if it's already counted on the primary diagonal (odd n)
            int j = n - 1 - i;
            if (i != j) {
                sum += mat[i][j];
            }
        }

        return sum;
    }
}
