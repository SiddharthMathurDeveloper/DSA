class Solution {
    public int deleteGreatestValue(int[][] grid) {
        // Get the number of rows and columns in the grid
        int gridRow = grid.length;
        int gridCol = grid[0].length;

        // Sort each row in the grid in ascending order
        for (int[] arr : grid) {
            Arrays.sort(arr);
        }

        // Initialize a variable to store the sum of the maximum values in each column
        int sumOfMaxAmongRows = 0;

        // Iterate through each column
        for (int col = 0; col < gridCol; col++) {
            // Initialize a variable to keep track of the maximum value in the current column
            int maxInColumn = Integer.MIN_VALUE;

            // Iterate through each row in the current column
            for (int row = 0; row < gridRow; row++) {
                // Find the maximum value in the current column
                maxInColumn = Math.max(maxInColumn, grid[row][col]);
            }

            // Add the maximum value in the current column to the sum
            sumOfMaxAmongRows += maxInColumn;
        }

        // Return the sum of the maximum values in each column
        return sumOfMaxAmongRows;
    }
}
