class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>(); // Stack to store indices of temperatures

        int n = temperatures.length;
        int[] ans = new int[n]; // Array to store the result

        // Iterate through the temperatures in reverse order
        for (int i = n - 1; i >= 0; i--) {
            // Pop elements from the stack until a greater temperature is found
            while (!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]) {
                stack.pop();
            }

            // If the stack is not empty, calculate the difference in indices
            if (!stack.empty()) {
                ans[i] = stack.peek() - i;
            }

            stack.push(i); // Push the current index onto the stack
        }

        return ans;
    }
}
