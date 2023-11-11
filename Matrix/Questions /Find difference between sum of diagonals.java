class Solution{
  
int diagonalSumDifference(int N, int[][] Grid) {
    // Initialize variables to track the sum of elements in the primary and secondary diagonals
    int primaryDiagonal = 0;
    int secondaryDiagonal = 0;

    // Iterate through the square grid to compute the sum of elements in both diagonals
    for (int i = 0; i < N; i++) {
        // Compute the sum of elements in the primary diagonal (top-left to bottom-right)
        primaryDiagonal += Grid[i][i];

        // Compute the sum of elements in the secondary diagonal (top-right to bottom-left)
        secondaryDiagonal += Grid[i][N - i - 1];
    }

    // Return the absolute difference between the sums of the two diagonals
    return Math.abs(primaryDiagonal - secondaryDiagonal);
}
}
