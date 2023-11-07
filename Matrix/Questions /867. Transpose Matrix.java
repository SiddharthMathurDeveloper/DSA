class Solution {
    public int[][] transpose(int[][] matrix) {
        // Get the number of rows and columns in the input matrix
        int matrixRow = matrix.length;
        int matrixCol = matrix[0].length;

        // Initialize a new matrix to store the transposed result
        int[][] ans = new int[matrixCol][matrixRow];

        // Iterate through the rows and columns of the original matrix
        for (int i = 0; i < matrixRow; i++) {
            for (int j = 0; j < matrixCol; j++) {
                // Swap the elements from the original matrix to the transposed matrix
                ans[j][i] = matrix[i][j];
            }
        }

        // Return the transposed matrix
        return ans;
    }
}
