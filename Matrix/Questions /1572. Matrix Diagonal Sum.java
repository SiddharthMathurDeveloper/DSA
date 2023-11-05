

class Solution {
    public int diagonalSum(int[][] mat) {
    // Get the size of the square matrix
    int n = mat.length;

    // Initialize a variable to store the sum of both diagonals
    int sumOfBothDiagonals = 0;

    // Loop through the rows and columns of the matrix
    for (int i = 0; i < n; i++) {
        // Add the element from the primary diagonal to the sum
        sumOfBothDiagonals += mat[i][i]; // Primary diagonal

        // Add the element from the secondary diagonal to the sum
        sumOfBothDiagonals += mat[i][n - i - 1]; // Secondary diagonal
    }

    // Check if the matrix has an odd dimension (center element exists)
    if (n % 2 != 0) {
        // Get the element at the center of the matrix
        int midElement = mat[n / 2][n / 2];

        // Subtract the middle element from the sum (as it was added twice)
        sumOfBothDiagonals -= midElement;
    }

    // Return the sum of both diagonals
    return sumOfBothDiagonals;
}
}

