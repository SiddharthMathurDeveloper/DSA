class Solution {
    // Function to return sum of upper and lower triangles of a matrix.
    static ArrayList<Integer> sumTriangles(int matrix[][], int n) {
        int lowerTriangleSum = 0;
        int upperTriangleSum = 0;

        // Iterate through the rows and columns of the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    // Diagonal elements belong to both upper and lower triangles
                    lowerTriangleSum += matrix[i][j];
                    upperTriangleSum += matrix[i][j];
                } else if (i > j) {
                    // Lower triangle elements are below the diagonal
                    lowerTriangleSum += matrix[i][j];
                } else {
                    // Upper triangle elements are above the diagonal
                    upperTriangleSum += matrix[i][j];
                }
            }
        }

        // Create an ArrayList to store the results
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ans.add(upperTriangleSum);
        ans.add(lowerTriangleSum);

        // Return the ArrayList containing the sums of upper and lower triangles
        return ans;
    }
}
