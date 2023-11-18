// User function to reverse the elements in a spiral order from the given matrix
class Solution {
    public int[] reverseSpiral(int R, int C, int[][] matrix) {
        // Initialize boundaries for traversal
        int left = 0;
        int right = C;
        int top = 0;
        int bottom = R;

        // Initialize an array to store the reversed spiral elements
        int[] reverseSpiralForm = new int[R * C];

        // Initialize an index to fill the reverseSpiralForm array
        int index = R * C - 1;

        // Spiral traversal to reverse the elements
        while (left < right && top < bottom) {

            // Traverse from left to right and store elements in reverseSpiralForm
            for (int i = left; i < right; i++) {
                reverseSpiralForm[index--] = matrix[top][i];
            }
            top += 1;

            // Traverse from top to bottom and store elements in reverseSpiralForm
            for (int i = top; i < bottom; i++) {
                reverseSpiralForm[index--] = matrix[i][right - 1];
            }
            right -= 1;

            // Check if there are remaining rows and columns
            if (left >= right || top >= bottom) {
                break;
            }

            // Traverse from right to left and store elements in reverseSpiralForm
            for (int i = right - 1; i >= left; i--) {
                reverseSpiralForm[index--] = matrix[bottom - 1][i];
            }
            bottom -= 1;

            // Traverse from bottom to top and store elements in reverseSpiralForm
            for (int i = bottom - 1; i >= top; i--) {
                reverseSpiralForm[index--] = matrix[i][left];
            }
            left += 1;
        }

        // Return the array containing reversed elements in a spiral order
        return reverseSpiralForm;
    }
}
