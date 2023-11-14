class Solution{
public void rotate(int[][] matrix) {
    int matrixRow = matrix.length; // Get the number of rows in the matrix

    int left = 0; // Initialize the left boundary
    int right = matrixRow - 1; // Initialize the right boundary

    // Iterate until the left boundary is less than the right boundary
    while (left < right) {
        // Iterate through each layer of the matrix
        for (int i = 0; i < right - left; i++) {
            int top = left; // Define the top boundary
            int bottom = right; // Define the bottom boundary

            // Swap elements in a circular manner for each layer
            swapElements(matrix, top, left + i, bottom, right - i);
            swapElements(matrix, top + i, right, bottom - i, left);
        }

        left += 1; // Move the left boundary inward
        right -= 1; // Move the right boundary inward
    }
    return;
}

// Method to swap elements in the matrix
public static void swapElements(int[][] matrix, int row1, int col1, int row2, int col2) {
    int temp = matrix[row1][col1];
    matrix[row1][col1] = matrix[row2][col2];
    matrix[row2][col2] = temp;
}

  
}
