class Solution {

    // Function to set zeroes in the matrix
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean firstRow = false;

        // Iterate through the matrix to mark cells with value 0 in the first row and column
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0; // Mark the column in the first row
                    if (i == 0) {
                        firstRow = true; // Mark that the first row needs to be zeroed
                    } else {
                        matrix[i][0] = 0; // Mark the row in the first column
                    }
                }
            }
        }

        // Iterate through the matrix (excluding the first row and column) to set zeroes
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0; // Set zeroes based on markings in the first row and column
                }
            }
        }

        // Check if the first element (matrix[0][0]) needs to be zeroed
        if (matrix[0][0] == 0) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0; // Zero out the first column
            }
        }

        // Check if the first row needs to be zeroed
        if (firstRow) {
            for (int j = 0; j < cols; j++) {
                matrix[0][j] = 0; // Zero out the first row
            }
        }
    }
}
