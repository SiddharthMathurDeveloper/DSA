class Solution {

    public void gameOfLife(int[][] board) {
        // Get the number of rows and columns in the board
        int boardRow = board.length;
        int boardCol = board[0].length;

        // Iterate through each cell in the board
        for (int i = 0; i < boardRow; i++) {
            for (int j = 0; j < boardCol; j++) {
                // Count the number of live neighbors for the current cell
                int neighbors = countNeighbours(board, i, j, boardRow, boardCol);

                // Apply the rules of the game of life
                if (board[i][j] == 1) {
                    // Cell is currently alive
                    if (neighbors == 2 || neighbors == 3) {
                        // Cell survives, mark it as 3 (alive in the next state)
                        board[i][j] = 3;
                    }
                } else {
                    // Cell is currently dead
                    if (neighbors == 3) {
                        // Cell becomes alive, mark it as 2 (alive in the next state)
                        board[i][j] = 2;
                    }
                }
            }
        }

        // Update the board based on the marked values
        for (int i = 0; i < boardRow; i++) {
            for (int j = 0; j < boardCol; j++) {
                if (board[i][j] == 1) {
                    // Cell was alive, mark it as dead (0 in the next state)
                    board[i][j] = 0;
                } else if (board[i][j] == 2 || board[i][j] == 3) {
                    // Cell was dead, mark it as alive (1 in the next state)
                    board[i][j] = 1;
                }
            }
        }

        return;
    }

    // Function to count live neighbors of a cell
    public int countNeighbours(int board[][], int r, int c, int rows, int cols) {
        int cnt = 0;

        // Define eight possible directions
        int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dc = {-1, 0, 1, -1, 1, -1, 0, 1};

        // Iterate through all eight directions
        for (int d = 0; d < 8; d++) {
            int newRow = r + dr[d];
            int newCol = c + dc[d];

            // Check if the new position is within bounds
            if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols) {
                // Check if the cell at the new position is 1 or 3 (alive in the current or next state)
                if (board[newRow][newCol] == 1 || board[newRow][newCol] == 3) {
                    cnt++;
                }
            }
        }

        // Return the count of live neighbors
        return cnt;
    }

}
