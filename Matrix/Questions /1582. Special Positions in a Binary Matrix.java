class Solution {

public int numSpecial(int[][] mat) {
    // Get the number of rows and columns in the matrix
    int m = mat.length;
    int n = mat[0].length;

    // Arrays to store the count of ones in each row and each column
    int[] rows = new int[m];
    int[] cols = new int[n];

    // Count the number of ones in each row and each column
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (mat[i][j] == 1) {
                // Increment the count of ones in the current row and column
                ++rows[i];
                ++cols[j];
            }
        }
    }

    // Variable to store the count of special positions
    int ans = 0;

    // Check for each cell if it is a special position
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (mat[i][j] == 1) {
                // Check if the count of ones in the corresponding row and column is 1
                if (rows[i] == 1 && cols[j] == 1) {
                    // Increment the count of special positions
                    ans++;
                }
            }
        }
    }

    // Return the final count of special positions
    return ans;
}

}
