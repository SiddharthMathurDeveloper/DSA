class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        // Get the number of rows and columns in the matrix
        int matRow = mat.length;
        int matCol = mat[0].length;

        // Initialize a variable to keep track of the maximum count of ones
        int maxCountedOnes = 0;

        // Initialize an array to store the result, where ans[0] will store the row index
        // with the maximum ones, and ans[1] will store the count of ones in that row.
        int[] ans = new int[2];

        // Iterate through each row in the matrix
        for (int i = 0; i < matRow; i++) {
            // Initialize a variable to count ones in the current row
            int countedOnes = 0;

            // Iterate through each column in the current row
            for (int j = 0; j < matCol; j++) {
                // Check if the current element is 1 and increment the count if it is
                if (mat[i][j] == 1) {
                    countedOnes++;
                }
            }

            // Update the maximum count of ones and the corresponding row index if needed
            if (countedOnes > maxCountedOnes) {
                maxCountedOnes = countedOnes;
                ans[0] = i; // Store the row index with the maximum ones
                ans[1] = maxCountedOnes; // Store the count of ones in that row
            }
        }

        // Return the array containing the row index with the maximum ones and the count of ones
        return ans;
    }
}
