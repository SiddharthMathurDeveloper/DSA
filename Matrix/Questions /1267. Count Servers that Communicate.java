class Solution {
    public int countServers(int[][] grid) {
        // Get the number of rows and columns in the grid
        int gridRow = grid.length;
        int gridCol = grid[0].length;

        // Arrays to store the count of servers in each row and column
        int[] row = new int[gridRow];
        int[] col = new int[gridCol];

        // Iterate through each cell in the grid
        for (int i = 0; i < gridRow; i++) {
            for (int j = 0; j < gridCol; j++) {
                // Check if the cell contains a server (value is 1)
                if (grid[i][j] == 1) {
                    // Increment the count of servers in the current row and column
                    ++row[i];
                    ++col[j];
                }
            }
        }

        // Variable to store the count of servers that can communicate with at least one other server
        int ans = 0;

        // Iterate through each cell in the grid again
        for (int i = 0; i < gridRow; i++) {
            for (int j = 0; j < gridCol; j++) {
                // Check if the cell contains a server (value is 1) and if it can communicate with at least one other server
                if (grid[i][j] == 1 && (row[i] >= 2 || col[j] >= 2)) {
                    // Increment the count of servers that can communicate
                    ans += 1;
                }
            }
        }

        // Return the final count
        return ans;
    }
}
