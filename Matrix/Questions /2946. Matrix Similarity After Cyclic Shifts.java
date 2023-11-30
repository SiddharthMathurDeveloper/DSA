class Solution {
    // Function to check if the matrix is similar after circular shifting
    public boolean areSimilar(int[][] mat, int k) {
        int m = mat.length; // Number of rows in the matrix
        int n = mat[0].length; // Number of columns in the matrix

        // Iterate through each element in the matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Check if the current element is equal to the element after circular shifting by k positions
                if (mat[i][j] != mat[i][(j + k) % n]) { // For each element, it checks if the element is equal to the element after circular shifting by k positions in the same row
                    return false; // If not equal, the matrices are not similar
                }
            }
        }
        return true; // If all elements are equal after circular shifting, the matrices are similar
    }
}
