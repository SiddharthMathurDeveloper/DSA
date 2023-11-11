class Solution {
    // Method to find the maximum prime number in the diagonals of a square matrix
    public int diagonalPrime(int[][] nums) {
        int maxPrimeNumberInDiagonal = 0; // Variable to store the maximum prime number found
        int n = nums.length; // Fetch the size of the matrix

        // Iterate through the matrix to check both primary and secondary diagonals
        for (int i = 0; i < n; i++) {
            // Check and update for the primary diagonal
            maxPrimeNumberInDiagonal = Math.max(checkPrimeNumber(nums[i][i]) ? nums[i][i] : 0, maxPrimeNumberInDiagonal);

            // Check and update for the secondary diagonal
            maxPrimeNumberInDiagonal = Math.max(checkPrimeNumber(nums[i][n - i - 1]) ? nums[i][n - i - 1] : 0, maxPrimeNumberInDiagonal);
        }

        return maxPrimeNumberInDiagonal; // Return the maximum prime number found in diagonals
    }

    // Method to check if a number is prime
    public boolean checkPrimeNumber(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If the number has divisors other than 1 and itself, it's not prime
            }
        }
        return true; // If the number passes all checks, it's prime
    }
}
