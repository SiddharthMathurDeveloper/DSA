class Solution {
public int[] finalPrices(int[] prices) {
    int pricesLength = prices.length;

    int[] ans = new int[pricesLength];

    Stack<Integer> nextSmallerElement = new Stack<>();

    // Iterate through prices in reverse order
    for (int i = pricesLength - 1; i >= 0; i--) {
        // Keep popping elements from the stack until an element smaller than or equal to prices[i] is found
        while (!nextSmallerElement.isEmpty() && nextSmallerElement.peek() > prices[i]) {
            nextSmallerElement.pop();
        }

        // If the stack is empty, or the top element is greater than prices[i], prices[i] is the final price
        if (nextSmallerElement.isEmpty()) {
            ans[i] = prices[i];
        } else {
            // Subtract the next smaller element from prices[i] to get the discount
            ans[i] = prices[i] - nextSmallerElement.peek();
        }

        // Push prices[i] onto the stack
        nextSmallerElement.push(prices[i]);
    }

    return ans;
}
}
