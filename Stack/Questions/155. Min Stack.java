
/* Solution 1

Time Complexity: O(1)
Space Complexity: O(2N)

*/
class Pair {
    int num, num2;
    Pair(int num, int num2) {
        this.num = num;
        this.num2 = num2;
    }
}

class MinStack {
    Stack <Pair> stack;  // Stack to maintain pairs of values (current value, minimum value)

    public MinStack() {
        stack = new Stack<>();
    }

    // Function to push a value onto the stack
    public void push(int val) {
        int min;
        if (stack.isEmpty()) {
            min = val;  // If the stack is empty, the minimum is the value itself
        } else {
            min = Math.min(stack.peek().num2, val);  // Update the minimum value
        }
        stack.push(new Pair(val, min));  // Push the pair (current value, minimum value) onto the stack
    }

    // Function to pop the top element from the stack
    public void pop() {
        stack.pop();
    }

    // Function to get the top element from the stack
    public int top() {
        return stack.peek().num;
    }

    // Function to get the minimum element from the stack
    public int getMin() {
         return stack.peek().num2;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
