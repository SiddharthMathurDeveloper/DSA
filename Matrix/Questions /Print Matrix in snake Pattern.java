class Solution {

static ArrayList<Integer> snakePattern(int matrix[][]) {
    int matrixRow = matrix.length;
    int matrixCol = matrix[0].length;

    // Initialize an ArrayList to store the elements in snake pattern order
    ArrayList<Integer> matrixToSnakePattern = new ArrayList<>();

    for (int i = 0; i < matrixRow; i++) {
        if (i % 2 == 0) { // For even rows, go left-to-right
            for (int j = 0; j < matrixCol; j++) {
                matrixToSnakePattern.add(matrix[i][j]);
            }
        } else { // For odd rows, go right-to-left
            for (int j = matrixCol - 1; j >= 0; j--) {
                matrixToSnakePattern.add(matrix[i][j]);
            }
        }
    }

    // Return the ArrayList containing elements in snake pattern order
    return matrixToSnakePattern;
}



  
}
