class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int matRow = mat.length;
        int matCol = mat[0].length;

        // Check if the total number of elements in the original matrix matches the new shape
        if (matRow * matCol != r * c) {
            // If not, return the original matrix without reshaping
            return mat;
        }

        // Create a new matrix with the specified number of rows and columns
        int[][] reshapedMatrix = new int[r][c];
        int row = 0;
        int col = 0;

        // Iterate through the original matrix and fill the reshaped matrix
        for (int i = 0; i < matRow; i++) {
            for (int j = 0; j < matCol; j++) {
                reshapedMatrix[row][col] = mat[i][j];
                col++;
                if (col == c) {
                    col = 0; // Reset column index when it reaches the specified number of columns
                    row++;
                }
            }
        }

        // Return the reshaped matrix
        return reshapedMatrix;
    }
}
