class Solution {
    // Function to calculate the sum of maximum values in each column of a sorted matrix
    public int matrixSum(int[][] grid) {
        // Get the number of rows and columns in the matrix
        int gridRow = grid.length;
        int gridCol = grid[0].length;

        // Sort each row in the matrix in ascending order
        for (int[] arr : grid) {
            Arrays.sort(arr);
        }

        // Initialize the variable to store the sum of maximum values among rows
        int sumOfMaxAmongRows = 0;

        // Iterate through each column
        for (int col = 0; col < gridCol; col++) {
            // Initialize the maximum value in the current column
            int maxInColumn = Integer.MIN_VALUE;

            // Iterate through each row in the current column
            for (int row = 0; row < gridRow; row++) {
                // Update the maximum value in the column
                maxInColumn = Math.max(maxInColumn, grid[row][col]);
            }

            // Add the maximum value in the current column to the overall sum
            sumOfMaxAmongRows += maxInColumn;
        }

        // Return the final sum of maximum values among rows
        return sumOfMaxAmongRows;
    }
}
