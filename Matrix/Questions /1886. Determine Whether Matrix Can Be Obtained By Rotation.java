class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        // Initialize a boolean array to track possible rotations (90, 180, 270, 360 & 0 degrees)
        boolean[] degreeRotation = {true, true, true, true};

        int n = mat.length; // Get the size of the matrix (assuming it's a square matrix)

        // Iterate through the matrix elements
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Check if the elements match after rotating by 90 degrees
                if (mat[i][j] != target[n - j - 1][i]) {
                    degreeRotation[0] = false;
                }

                // Check if the elements match after rotating by 180 degrees
                if (mat[i][j] != target[n - i - 1][n - j - 1]) {
                    degreeRotation[1] = false;
                }

                // Check if the elements match after rotating by 270 degrees
                if (mat[i][j] != target[j][n - i - 1]) {
                    degreeRotation[2] = false;
                }

                // Check if the elements match after rotating by 360 degrees (or 0 degrees)
                if (mat[i][j] != target[i][j]) {
                    degreeRotation[3] = false;
                }
            }
        }

        // Return true if at least one rotation is possible, otherwise return false
        return degreeRotation[0] || degreeRotation[1] || degreeRotation[2] || degreeRotation[3];
    }
}
