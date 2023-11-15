class Solution{
    public static void multiply(int A[][], int B[][], int C[][], int N) {
    // Iterate through each row of matrix A
      for (int i = 0; i < N; i++) {
        // Iterate through each column of matrix B
          for (int j = 0; j < N; j++) {
            // Initialize the result for the current cell to 0
              C[i][j] = 0;

              // Iterate through each element in the row of A and column of B
              for (int k = 0; k < N; k++) {
                  // Multiply the corresponding elements and accumulate the result
                  C[i][k] += A[i][j] * B[j][k];
              }
          }
      }

    return;
  }

}
