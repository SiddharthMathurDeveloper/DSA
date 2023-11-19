class Solution {

  public int[] findDiagonalOrder(int[][] mat) {
    int m = mat.length;
    int n = mat[0].length;

    // Initialize an array to store the diagonal order elements
    int[] ans = new int[m * n];

    // Initialize index for filling the ans array
    int i = 0;

    // Initialize starting position
    int row = 0;
    int col = 0;

    // Flag to indicate the direction of traversal
    boolean up = true;

    // Traverse the matrix in diagonal order
    while (row < m && col < n) {
        if (up) {
            // Traverse diagonally upward
            while (row > 0 && col < n - 1) {
                ans[i++] = mat[row][col];
                row--;
                col++;
            }
            ans[i++] = mat[row][col];

            // Adjust position after each diagonal traversal
            if (col == n - 1) {
                row++;
            } else {
                col++;
            }
        } else {
            // Traverse diagonally downward
            while (col > 0 && row < m - 1) {
                ans[i++] = mat[row][col];
                row++;
                col--;
            }
            ans[i++] = mat[row][col];

            // Adjust position after each diagonal traversal
            if (row == m - 1) {
                col++;
            } else {
                row++;
            }
        }

        // Toggle the direction for the next traversal
        up = !up;
    }

    return ans;
}
  
}
