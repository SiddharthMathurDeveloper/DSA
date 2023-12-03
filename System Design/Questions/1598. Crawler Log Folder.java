class Solution {
    // Method to calculate the minimum operations required based on a sequence of directory logs
    public int minOperations(String[] logs) {
        int count = 0;  // Variable to keep track of the current depth in the directory structure

        // Iterate through each log in the array
        for (String log : logs) {
            // Check the type of log and update the count accordingly
            if (log.equals("../")) {
                // If the log is "../", move up one level in the directory structure
                count -= 1;
            } else if (log.equals("./")) {
                // If the log is "./", stay at the same level in the directory structure (no change)
                count += 0;
            } else {
                // If the log is a directory name, move down one level in the directory structure
                count += 1;
            }

            // Ensure that the count doesn't go below 0 (stay at the root level or higher)
            if (count == -1) {
                count = 0;
            }
        }

        // The final count represents the minimum operations required to reach the destination directory
        return count;
    }
}
