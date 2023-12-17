class Solution {
    // Helper method to calculate (base^exponent) % mod efficiently
    private static long power(long base, long exponent, long mod) {
        long result = 1;
        base = base % mod;

        // Exponentiation by squaring
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % mod;
            }

            exponent = exponent >> 1; // Right shift the exponent
            base = (base * base) % mod;
        }

        return result;
    }

    // Helper method to perform double modular exponentiation
    private long doubleModularExponentiation(int a, int b, int c, int m) {
        // Calculate (a^b) % 10
        long value = power(a, b, 10);
        // Calculate (value^c) % m
        long value2 = power(value, c, m);

        return value2;
    }

    // Main method to get the list of good indices
    public List<Integer> getGoodIndices(int[][] variables, int target) {
        List<Integer> ans = new ArrayList<>();
        int n = variables.length;

        // Iterate through each row in the 'variables' array
        for (int row = 0; row < n; row++) {
            // Extract values from the current row
            int a_ith = variables[row][0];
            int b_ith = variables[row][1];
            int c_ith = variables[row][2];
            int m_ith = variables[row][3];

            // Check if the result of double modular exponentiation is equal to the target
            if (doubleModularExponentiation(a_ith, b_ith, c_ith, m_ith) == target) {
                ans.add(row); // Add the index to the result list
            }
        }

        return ans;
    }
}
