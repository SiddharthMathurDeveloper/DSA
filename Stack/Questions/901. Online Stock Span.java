
/* Solution 
TC -> O(N)
SC -> O(N)
*/
class Pair {
    int index;
    int stockPrice;

    // Constructor for Pair class
    Pair(int index, int stockPrice) {
        this.index = index;
        this.stockPrice = stockPrice;
    }
}

class StockSpanner {

    Stack<Pair> stack; // Stack to maintain pairs of (index, stockPrice)
    int index = 1; // Variable to keep track of the current index

    public StockSpanner() {
        stack = new Stack<>();
    }

    // Function to calculate the span of the stock price
    public int next(int price) {
        // Pop elements from the stack while the current price is greater than or equal to the stockPrice on the top of the stack
        while (!stack.empty() && price >= stack.peek().stockPrice) {
            stack.pop();
        }

        // Calculate the span (difference between the current index and the index on the top of the stack)
        int ans = stack.empty() ? index : index - stack.peek().index;

        // Push the current pair (index, stockPrice) onto the stack
        stack.push(new Pair(index, price));

        // Increment the index for the next call
        index++;

        // Return the calculated span
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
