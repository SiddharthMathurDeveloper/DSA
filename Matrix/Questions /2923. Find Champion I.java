class Solution {
  public int findChampion(int[][] grid) {
    // Get the number of teams (assuming square grid)
    int n = grid.length;

    // Initialize variables to keep track of the team with the maximum wins
    int maxWins = -1;
    int winningTeam = 0;

    // Iterate over each row (team) to find the team with the most wins
    for (int i = 0; i < n; i++) {
        // Count the number of wins (1s) for the current team
        int countOfOnes = 0;
        for (int j = 0; j < n; j++) {
            if (grid[i][j] == 1) {
                countOfOnes++;
            }
        }

        // Update the winning team if the current team has more wins
        if (countOfOnes > maxWins) {
            maxWins = countOfOnes;
            winningTeam = i;
        }
    }

    // Return the index of the winning team (0-based index)
    return winningTeam;
}


  
}
