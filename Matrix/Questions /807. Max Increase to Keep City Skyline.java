class Solution {
  public int maxIncreaseKeepingSkyline(int[][] grid) {
    int gridRow = grid.length; // Get the number of rows in the grid
    int gridCol = grid[0].length; // Get the number of columns in the grid

    // Arrays to store the maximum height in each row and column
    int[] row = new int[gridRow];
    int[] col = new int[gridCol];

    int ans = 0; // Variable to store the final result

    // Calculate the maximum height in each row and column
    for (int i = 0; i < gridRow; i++) {
        int rowMax = -1;
        int colMax = -1;
        for (int j = 0; j < gridCol; j++) {
            rowMax = Math.max(grid[i][j], rowMax); // Update the maximum height in the current row
            colMax = Math.max(grid[j][i], colMax); // Update the maximum height in the current column
        }
        row[i] = rowMax; // Store the maximum height in the row array
        col[i] = colMax; // Store the maximum height in the column array
    }

    // Calculate the total increase in height required to keep the skyline
    for (int i = 0; i < gridRow; i++) {
        for (int j = 0; j < gridCol; j++) {
            ans += (Math.min(row[i], col[j]) - grid[i][j]); // Calculate the increase for each building
        }
    }

    return ans; // Return the total increase in height required
}

}
