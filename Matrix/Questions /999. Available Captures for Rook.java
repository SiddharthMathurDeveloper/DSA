class Solution {
    public int numRookCaptures(char[][] board) {
        // Get the number of rows and columns in the chessboard
        int boardRow = board.length;
        int boardCol = board[0].length;

        // Initialize a variable to count the black pawns captured by the rook
        int rookCapturedBlackPawns = 0;

        // Initialize an array to store the row and column indices of the rook
        int[] rookIndex = new int[2];

        // Find the position of the rook in the chessboard
        for (int i = 0; i < boardRow; i++) {
            for (int j = 0; j < boardCol; j++) {
                if (board[i][j] == 'R') {
                    rookIndex[0] = i; // Row index of the rook
                    rookIndex[1] = j; // Column index of the rook
                }
            }
        }

        int rookRow = rookIndex[0];
        int rookColumn = rookIndex[1];

        // North
        for (int i = rookRow; i >= 0; i--) {
            if (board[i][rookColumn] == 'p') {
                rookCapturedBlackPawns++;
                break;
            }

            if (board[i][rookColumn] == 'B') {
                break;
            }
        }

        // South
        for (int i = rookRow; i < boardCol; i++) {
            if (board[i][rookColumn] == 'p') {
                rookCapturedBlackPawns++;
                break;
            }

            if (board[i][rookColumn] == 'B') {
                break;
            }
        }

        // East
        for (int i = rookColumn; i < boardRow; i++) {
            if (board[rookRow][i] == 'p') {
                rookCapturedBlackPawns++;
                break;
            }

            if (board[rookRow][i] == 'B') {
                break;
            }
        }

        // West
        for (int i = rookColumn; i >= 0; i--) {
            if (board[rookRow][i] == 'p') {
                rookCapturedBlackPawns++;
                break;
            }

            if (board[rookRow][i] == 'B') {
                break;
            }
        }

        // Return the number of black pawns captured by the rook
        return rookCapturedBlackPawns;
    }
}
