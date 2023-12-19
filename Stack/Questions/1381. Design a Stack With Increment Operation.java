
/* Solution 1
 Time - O(N)
 Space - O(N)
*/

class CustomStack {

    Stack<Integer> stack;  // Stack to store integers
    int maxSize;  // Maximum size allowed for the stack

    // Constructor to initialize the CustomStack with a maximum size
    public CustomStack(int maxSize) {
        stack = new Stack<>();
        this.maxSize = maxSize;
    }

    // Function to push an element onto the stack
    public void push(int x) {
        // Check if the stack has reached its maximum size
        if (maxSize == stack.size()) {
            return;  // If reached, do not push and return
        }
        stack.push(x);  // Otherwise, push the element onto the stack
    }

    // Function to pop the top element from the stack
    public int pop() {
        // Check if the stack is empty
        if (stack.isEmpty()) {
            return -1;  // If empty, return -1
        }
        return stack.pop();  // Otherwise, pop and return the top element
    }

    // Function to increment the bottom k elements of the stack by a given value
    public void increment(int k, int val) {
        // Check if the stack size is less than k
        if (stack.size() < k) {
            getIncrementedStack(stack, stack.size(), val);  // Increment the entire stack
        } else {
            getIncrementedStack(stack, k, val);  // Increment the bottom k elements
        }
    }

    // Helper function to increment the bottom k elements of the stack
    private void getIncrementedStack(Stack<Integer> stack, int k, int val) {
        Stack<Integer> temp = new Stack<>();

        // Transfer elements from the original stack to a temporary stack
        while (!stack.isEmpty()) {
            temp.push(stack.pop());
        }

        // Transfer elements back to the original stack and increment the bottom k elements
        while (!temp.isEmpty()) {
            int value = temp.pop();

            if (k > 0) {
                value += val;  // Increment only if there are still elements to be incremented
            }

            stack.push(value);
            k--;
        }

        return;
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k, val);
 */


/* Solution 2
 Time - O(1)
 Space - O(2N)
*/


class CustomStack {

    int maxSize;  // Maximum size allowed for the stack
    int[] increment;  // Array to store increments for each element in the stack
    Stack<Integer> stack;  // Stack to store integers

    // Constructor to initialize the CustomStack with a maximum size
    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        increment = new int[maxSize];
        stack = new Stack<>();
    }

    // Function to push an element onto the stack
    public void push(int value) {
        // Check if the stack has reached its maximum size
        if (stack.size() < maxSize) {
            stack.push(value);  // If not reached, push the element onto the stack
        }
    }

    // Function to pop the top element from the stack
    public int pop() {
        int currentStackSize = stack.size() - 1;

        // Check if the stack is empty
        if (currentStackSize < 0) {
            return -1;  // If empty, return -1
        }

        // Update the increment of the previous element
        if (currentStackSize > 0) {
            increment[currentStackSize - 1] += increment[currentStackSize];
        }

        // Pop and return the top element with applied increment
        int poppedElement = stack.pop() + increment[currentStackSize];
        increment[currentStackSize] = 0;  // Reset the increment for the popped element
        return poppedElement;
    }

    // Function to increment the bottom k elements of the stack by a given value
    public void increment(int k, int val) {
        int currentSize = Math.min(k, stack.size()) - 1;

        // Check if the current size is non-negative and within the bounds of the stack
        if (currentSize >= 0) {
            increment[currentSize] += val;  // Increment the specified element
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k, val);
 */









