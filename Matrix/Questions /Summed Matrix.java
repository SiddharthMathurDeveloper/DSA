class Solution {
    // Static method to compute the sum of elements in a matrix
    static long sumMatrix(long n, long q) {
        // If q is greater than twice the value of n, return 0
        if (q > 2 * n) {
            return 0;
        }
        // Calculate the sum based on a specific pattern
        return n - Math.abs(n + 1 - q);
    }
}
