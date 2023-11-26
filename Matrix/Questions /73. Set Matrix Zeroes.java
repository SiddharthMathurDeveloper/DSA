class Solution {
    public void setZeroes(int[][] matrix) {
        // Get the number of rows and columns in the matrix
        int matrixRow = matrix.length;
        int matrixCol = matrix[0].length;

        // Arrays to mark rows and columns that need to be zeroed
        int[] rows = new int[matrixRow];
        int[] cols = new int[matrixCol];

        // Iterate through each element in the matrix
        for (int i = 0; i < matrixRow; i++) {
            for (int j = 0; j < matrixCol; j++) {
                // If the current element is 0, mark the corresponding row and column
                if (matrix[i][j] == 0) {
                    if (rows[i] == 0) {
                        rows[i] = 1; // Mark the row
                    }
                    if (cols[j] == 0) {
                        cols[j] = 1; // Mark the column
                    }
                }
            }
        }

        // Iterate through each element in the matrix again
        for (int i = 0; i < matrixRow; i++) {
            for (int j = 0; j < matrixCol; j++) {
                // If the current element is 0, or its corresponding row or column is marked, set it to 0
                if (matrix[i][j] == 0 || rows[i] == 1 || cols[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }

        return;
    }
}
