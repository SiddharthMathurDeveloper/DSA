class Solution {
    // Method to find the column with the maximum number of zeros in a square matrix
    int columnWithMaxZeros(int arr[][], int N) {
        int maxZerosInColumn = 0; // Variable to track the maximum count of zeros in a column

        int ans = -1; // Initializing the answer to -1, assuming no column contains zeros

        // Iterate through each column
        for (int col = 0; col < N; col++) {
            int countZeros = 0; // Counter to track the number of zeros in the current column

            // Iterate through each row in the column
            for (int row = 0; row < N; row++) {
                // If the element in the current row and column is zero, increment the zero count
                if (arr[row][col] == 0) {
                    countZeros++;
                }
            }

            // Check if the zero count in the current column is greater than the maximum zero count so far
            if (countZeros > maxZerosInColumn) {
                maxZerosInColumn = countZeros; // Update the maximum zero count
                ans = col; // Update the answer to the column index containing the maximum zeros
            }
        }

        // Return the column index with the maximum number of zeros
        return ans;
    }
}
