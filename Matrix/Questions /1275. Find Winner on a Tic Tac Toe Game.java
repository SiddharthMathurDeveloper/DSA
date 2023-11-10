class Solution {
    public String tictactoe(int[][] moves) {
        // Arrays to track moves made by player A and player B along rows, columns, and diagonals
        int[] A = new int[8];
        int[] B = new int[8];

        int n = moves.length; // Total number of moves played

        for (int i = 0; i < n; i++) {
            int row = moves[i][0];
            int column = moves[i][1];

            // Determine the current player based on the number of moves played (A: even, B: odd)
            int[] currentPlayer = (i % 2 == 0) ? A : B;

            // Increment the counts for the current player along row and column arrays
            ++currentPlayer[row];
            ++currentPlayer[column + 3];

            // Increment counts for diagonals if the move is on the main diagonal
            if (row == column) {
                ++currentPlayer[6];
            }

            // Increment counts for diagonals if the move is on the secondary diagonal
            if (row == 2 - column) {
                ++currentPlayer[7];
            }
        }

        // Check if either player has won based on the counts in the tracking arrays
        for (int i = 0; i < 8; i++) {
            if (A[i] == 3) {
                return "A"; // Player A wins
            } else if (B[i] == 3) {
                return "B"; // Player B wins
            }
        }

        // If no winner is found, check for a draw or pending status based on total moves played
        return (n == 9) ? "Draw" : "Pending";
    }
}

