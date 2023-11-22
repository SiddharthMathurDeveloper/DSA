class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        // Initialize the result array to store the coordinates of the spiral matrix
        int[][] ans = new int[rows * cols][2];

        // Initialize index variable for traversing the result array
        int i = 0;

        // Store the starting coordinates in the result array
        ans[i++] = new int[]{rStart, cStart};

        // Initialize move length and current direction variables
        int moveLength = 0;
        int currentDirection = 0;

        // Define directions for moving right, down, left, and up
        int[] rowDirections = new int[]{0, 1, 0, -1};
        int[] colDirections = new int[]{1, 0, -1, 0};

        // Continue traversing the matrix until all coordinates are filled
        while (i < rows * cols) {
            // For right and left movements, increase the move length
            if (currentDirection == 0 || currentDirection == 2) {
                moveLength++;
            }

            // Move in the current direction for the specified move length
            for (int k = 0; k < moveLength; k++) {
                rStart += rowDirections[currentDirection];
                cStart += colDirections[currentDirection];

                // Check if the new coordinates are within the matrix boundaries
                if (rStart < rows && rStart >= 0 && cStart < cols && cStart >= 0) {
                    // Store the current coordinates in the result array
                    ans[i++] = new int[]{rStart, cStart};
                }
            }

            // Move to the next direction in a clockwise manner (right -> down -> left -> up)
            currentDirection++;
            currentDirection = currentDirection % 4;
        }

        // Return the final result array containing the coordinates of the spiral matrix
        return ans;
    }
}
