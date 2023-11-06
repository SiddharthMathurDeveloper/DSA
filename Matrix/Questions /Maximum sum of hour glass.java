class Solution {
    int findMaxSum(int N, int M, int Mat[][]) {
        // Check if the dimensions of the matrix are less than 3x3, and return -1 if true
        if (N < 3 || M < 3) {
            return -1;
        }

        // Initialize a variable to store the maximum hourglass value found
        int maxHourGlassValue = -1;

        for (int i = 0; i < N - 2; i++) {
            for (int j = 0; j < M - 2; j++) {
                // Initialize a variable to accumulate the sum of the hourglass elements
                int hourGlassValue = 0;

                // Calculate the sum of the hourglass elements:
                // - Top row (3 elements)
                hourGlassValue += Mat[i][j] + Mat[i][j + 1] + Mat[i][j + 2];
                // - Middle element
                hourGlassValue += Mat[i + 1][j + 1];
                // - Bottom row (3 elements)
                hourGlassValue += Mat[i + 2][j] + Mat[i + 2][j + 1] + Mat[i + 2][j + 2];

                // Update the maximum hourglass value if the current value is greater
                maxHourGlassValue = Math.max(hourGlassValue, maxHourGlassValue);

                // Reset the hourGlassValue for the next iteration
                hourGlassValue = 0;
            }
        }

        // Return the maximum hourglass value found in the matrix
        return maxHourGlassValue;
    }
}
