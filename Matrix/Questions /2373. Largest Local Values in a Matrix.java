class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;

        // Initialize a new matrix to store the largest values in each 3x3 submatrix
        int[][] largestValuesMatrix = new int[n - 2][n - 2];

        // Iterate over the input grid, leaving a 1-cell border around the edges
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                int maxValueIn3x3 = Integer.MIN_VALUE;

                // Iterate over the 3x3 submatrix
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        // Find the maximum value in the submatrix
                        maxValueIn3x3 = Math.max(maxValueIn3x3, grid[i + k][j + l]);
                    }
                }

                // Store the maximum value in the corresponding position in the result matrix
                largestValuesMatrix[i][j] = maxValueIn3x3;
            }
        }

        // Return the matrix containing the largest values in each 3x3 submatrix
        return largestValuesMatrix;
    }
}
