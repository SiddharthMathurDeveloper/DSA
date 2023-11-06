class Solution {
    public int maximumWealth(int[][] accounts) {
        // Get the number of customers (rows) and banks (columns)
        int accountsRow = accounts.length;
        int accountsCol = accounts[0].length;

        // Initialize a variable to keep track of the maximum wealth of a customer
        int wealthCustomer = Integer.MIN_VALUE;

        // Iterate through each customer's accounts
        for (int i = 0; i < accountsRow; i++) {
            int currentCustomerMoney = 0; // Initialize the wealth of the current customer

            // Sum up the money in all the bank accounts for the current customer
            for (int j = 0; j < accountsCol; j++) {
                currentCustomerMoney += accounts[i][j];
            }

            // Update the maximum wealth if the current customer's wealth is greater
            wealthCustomer = Math.max(wealthCustomer, currentCustomerMoney);
        }

        // Return the maximum wealth among all customers
        return wealthCustomer;
    }
}
