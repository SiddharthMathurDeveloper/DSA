class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        // Get the number of rows and columns in the matrix
        int matrixRow = matrix.length;
        int matrixCol = matrix[0].length;

        // Iterate through the matrix, excluding the last row and column
        for (int i = 0; i < matrixRow - 1; i++) {
            for (int j = 0; j < matrixCol - 1; j++) {
                // Check if the current element is not equal to the element diagonally below and to the right
                if (matrix[i][j] != matrix[i + 1][j + 1]) {
                    // If not, the matrix is not Toeplitz, so return false
                    return false;
                }
            }
        }

        // If the loop completes without returning false, the matrix is Toeplitz, so return true
        return true;
    }
}


/*
What if the matrix is stored on disk, and the memory is limited such that you can only load at most one row of the matrix into memory at once ?

If the matrix is stored on disk, and you can only load one row into memory at a time, you can adapt the algorithm to read and process one row at a time. You would need to load each row, compare it with the previous row (if available), and then move on to the next row. You would need to keep track of the elements in the current and previous rows. This approach will work for very large matrices as long as you can sequentially read rows from disk.

What if the matrix is so large that you can only load up a partial row into memory at once?

If the matrix is extremely large and you can only load a portion of a row into memory, you would need to read and process the matrix in smaller segments. You could load a portion of the current row, compare it with the corresponding portion of the previous row, and then move on to the next segment. This requires dividing the rows into smaller blocks, reading and comparing these blocks, and continuing the process until the entire matrix has been processed. This approach allows you to work with very large matrices without requiring the entire matrix to fit in memory simultaneously.
  */
