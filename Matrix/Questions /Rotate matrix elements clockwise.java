class Solution {
int[][] rotateMatrix(int M, int N, int matrix[][]) {
    // Initialize variables for the boundaries of the matrix
    int top = 0;
    int bottom = M - 1;
    int left = 0;
    int right = N - 1;

    // Continue rotating until the boundaries meet
    while (top < bottom && left < right) {
        // Store the top-left element in a temporary variable
        int temp = matrix[left][top];

        // Move elements in the left column from top to bottom-1
        for (int i = top; i < bottom; i++) {
            matrix[i][left] = matrix[i + 1][left];
        }

        // Move elements in the bottom row from left to right-1
        for (int j = left; j < right; j++) {
            matrix[bottom][j] = matrix[bottom][j + 1];
        }
        left++;

        // Move elements in the right column from bottom to top+1
        for (int i = bottom; i > top; i--) {
            matrix[i][right] = matrix[i - 1][right];
        }
        bottom--;

        // Move elements in the top row from right to left+1
        for (int j = right; j > left; j--) {
            matrix[top][j] = matrix[top][j - 1];
        }
        
        // Place the stored top-left element in its new position
        matrix[top][left] = temp;
        top++;
        right--;
    }

    // Return the rotated matrix
    return matrix;
}
}
