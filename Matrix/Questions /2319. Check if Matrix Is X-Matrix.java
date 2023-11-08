class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int matrixRow = grid.length;
        int matrixCol = grid[0].length;

        // Iterate through the rows and columns of the grid
        for (int i = 0; i < matrixRow; i++) {
            for (int j = 0; j < matrixCol; j++) {
                // Check if the current element is on either the main diagonal or the anti-diagonal
                if (i == j || i + j == matrixCol - 1) {
                    // If the element is on either diagonal, it must be 1; otherwise, return false
                    if (grid[i][j] == 0) {
                        return false;
                    }
                } else {
                    // If the element is not on either diagonal, it must be 0; otherwise, return false
                    if (grid[i][j] != 0) {
                        return false;
                    }
                }
            }
        }

        // If the code reaches this point, the grid forms an "X" pattern, so return true
        return true;
    }
}
