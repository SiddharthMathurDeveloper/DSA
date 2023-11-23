class Solution {
    public int[] antiDiagonalPattern(int[][] matrix) {
        // Initialize variables for starting row and column, and index for the result array
        int rowStart = 0, colStart = 0;
        int index = 0;

        // Create an array to store the anti-diagonal pattern elements
        int[] ans = new int[matrix.length * matrix.length];

        // Loop until the starting row is less than the matrix length
        while (rowStart < matrix.length) {
            int row = rowStart;
            int col = colStart;

            // Traverse along the anti-diagonal and store elements in the result array
            while (row < matrix.length && col >= 0) {
                ans[index++] = matrix[row][col];
                row++;
                col--;
            }

            // Update the starting row and column based on the current position
            if (colStart == matrix.length - 1) {
                rowStart++;
            } else {
                colStart++;
            }
        }

        // Return the resulting anti-diagonal pattern array
        return ans;
    }
}
