class Solution {
    // Function to modify the matrix such that if a matrix cell matrix[i][j]
    // is 1 then all the cells in its ith row and jth column will become 1.
    void booleanMatrix(int matrix[][]) {
        // Get the number of rows and columns in the matrix
        int matrixRow = matrix.length;
        int matrixCol = matrix[0].length;

        // Arrays to track rows and columns that contain 1
        int[] row = new int[matrixRow];
        int[] col = new int[matrixCol];

        // Iterate through the matrix to mark rows and columns containing 1
        for (int i = 0; i < matrixRow; i++) {
            for (int j = 0; j < matrixCol; j++) {
                if (matrix[i][j] == 1) {
                    row[i] = 1; // Mark the ith row
                    col[j] = 1; // Mark the jth column
                }
            }
        }

        // Update the matrix based on marked rows and columns
        for (int i = 0; i < matrixRow; i++) {
            for (int j = 0; j < matrixCol; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 1; // Set matrix cell to 1 if its row or column is marked
                }
            }
        }

        return;
    }
}
