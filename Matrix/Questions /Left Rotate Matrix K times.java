class Solution {
    // Method to rotate the matrix
    int[][] rotateMatrix(int N, int M, int K, int Mat[][]) {
        K = K % M; // Ensuring the effective rotation within the matrix width
        if (K == 0) {
            return Mat; // If the rotation is by 0, return the matrix as is
        }
        
        // Perform three reverse operations to rotate the matrix
        reverseMatrix(0, K - 1, Mat); // Reverse the subarray from index 0 to K - 1
        reverseMatrix(K, M - 1, Mat); // Reverse the subarray from index K to M - 1
        reverseMatrix(0, M - 1, Mat); // Reverse the entire array
        
        return Mat; // Return the rotated matrix
    }
    
    // Method to reverse a subarray within the matrix
    private static void reverseMatrix(int start, int end, int Mat[][]) {
        int row = Mat.length; // Get the number of rows in the matrix
        
        // Reverse the subarray within the matrix
        while (start < end) {
            for (int i = 0; i < row; i++) {
                int temp = Mat[i][end];
                Mat[i][end] = Mat[i][start];
                Mat[i][start] = temp;
            }
            start++;
            end--;
        }
        return;
    }
}
