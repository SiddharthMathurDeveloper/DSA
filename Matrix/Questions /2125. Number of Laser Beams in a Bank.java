class Solution{
  public int numberOfBeams(String[] bank) {
    int TotalNumberOfLaserBeamsInBank = 0; // Variable to store the total number of laser beams

    int[] arr = {0, 0}; // Array to store the count of '1's and the count of previous '1's in each row

    for (String str : bank) {
        arr[0] = 0; // Reset the count of '1's in the current row
        for (char cell : str.toCharArray()) {
            if (cell == '1') {
                ++arr[0]; // Count the number of '1's in the current row
            }
        }

        if (arr[0] != 0) {
            // If there are '1's in the current row, update the total number of laser beams
            TotalNumberOfLaserBeamsInBank += (arr[0] * arr[1]);
            arr[1] = arr[0]; // Update the count of previous '1's for the next row
        }
    }

    return TotalNumberOfLaserBeamsInBank; // Return the total number of laser beams in the bank
}





  
}
