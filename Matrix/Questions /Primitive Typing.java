class Solution{

  public int FindPath(String str) {
    int strLength = str.length(); // Get the length of the input string
    
    int ans = 0; // Initialize a variable to store the resulting path distance
    int curRow = 0; // Initialize the current row position on the grid
    int curCol = 0; // Initialize the current column position on the grid
    
    for (int i = 0; i < strLength; i++) {
        int a = (int) str.charAt(i) - (int) 'a'; // Get the numerical representation of the character
        
        // Map the numerical representation to a 5x5 grid
        int row = a / 5; // Calculate the row index
        int col = a % 5; // Calculate the column index
        
        // Calculate the path distance (absolute difference) between the current position and the character's position
        ans += Math.abs(row - curRow); // Add the absolute difference in rows
        ans += Math.abs(col - curCol); // Add the absolute difference in columns
        
        // Update the current row and column positions
        curRow = row;
        curCol = col;
    }
    
    ans += strLength; // Add the total length of the input string to the path distance
    
    return ans; // Return the total path distance
}

}
