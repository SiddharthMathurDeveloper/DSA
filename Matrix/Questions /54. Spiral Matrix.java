class Solution{

public List<Integer> spiralOrder(int[][] matrix) {
    int left = 0;
    int right = matrix[0].length;
    int top = 0;
    int bottom = matrix.length;

    List<Integer> spiralForm = new ArrayList<>();

    // Iterate in a spiral order until the boundaries meet
    while (left < right && top < bottom) {

        // Traverse from left to right in the current top row
        for (int i = left; i < right; i++) {
            spiralForm.add(matrix[top][i]);
        }
        top += 1;

        // Traverse from top to bottom in the current rightmost column
        for (int i = top; i < bottom; i++) {
            spiralForm.add(matrix[i][right - 1]);
        }
        right -= 1;

        // Check if boundaries have met
        if (left >= right || top >= bottom) {
            break;
        }

        // Traverse from right to left in the current bottom row
        for (int i = right - 1; i >= left; i--) {
            spiralForm.add(matrix[bottom - 1][i]);
        }
        bottom -= 1;

        // Traverse from bottom to top in the current leftmost column
        for (int i = bottom - 1; i >= top; i--) {
            spiralForm.add(matrix[i][left]);
        }
        left += 1;
    }

    return spiralForm; // Return the elements in spiral order
}

}
