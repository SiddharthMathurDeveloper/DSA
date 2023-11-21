
class Solution {
public int countBattleships(char[][] board) {
    // Get the number of rows and columns in the board
    int boardRow = board.length;
    int boardCol = board[0].length;

    // Variable to store the count of battleships
    int battleshipsCounted = 0;

    // Iterate through each cell in the board
    for (int i = 0; i < boardRow; i++) {
        for (int j = 0; j < boardCol; j++) {
            // Skip empty cells (water)
            if (board[i][j] == '.') {
                continue;
            }

            // Check if the battleship's left or upper neighbor is 'X'
            // If true, it means the current cell is part of the same battleship
            if (i > 0 && board[i - 1][j] == 'X') { // for upper 
                continue;
            }

            if (j > 0 && board[i][j - 1] == 'X') { //for left
                continue;
            }

            // If the above conditions are not met, it means the current 'X' is the start of a new battleship
            battleshipsCounted++;
        }
    }

    // Return the count of battleships
    return battleshipsCounted;
}

}
