class Solution {
    public boolean isValidSudoku(char[][] board) {
        // HashSet to check uniqueness in each row and column
        HashSet<Character> rows = new HashSet<>();
        HashSet<Character> cols = new HashSet<>();

        // Check each row and column for uniqueness
        for (int i = 0; i < 9; i++) {
            rows = new HashSet<>();
            cols = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char rowCell = board[i][j];
                char colCell = board[j][i];

                // Check uniqueness in the row
                if (rowCell != '.') {
                    if (rows.contains(board[i][j])) {
                        return false;
                    } else {
                        rows.add(board[i][j]);
                    }
                }

                // Check uniqueness in the column
                if (colCell != '.') {
                    if (cols.contains(board[j][i])) {
                        return false;
                    } else {
                        cols.add(board[j][i]);
                    }
                }
            }
        }

        // Check each 3x3 grid for uniqueness
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!validGrid(board, i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    // Helper function to check the uniqueness of a 3x3 grid
    public boolean validGrid(char[][] board, int currentRow, int currentCol) {
        HashSet<Character> blockSet = new HashSet<>();

        int row = currentRow + 3;
        int col = currentCol + 3;

        // Check each cell in the 3x3 grid for uniqueness
        for (int i = currentRow; i < row; i++) {
            for (int j = currentCol; j < col; j++) {
                char cell = board[i][j];
                if (cell == '.') {
                    continue;
                }

                if (blockSet.contains(cell)) {
                    return false;
                }

                blockSet.add(board[i][j]);
            }
        }
        return true;
    }
}
