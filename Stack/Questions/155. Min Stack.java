
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




/* Solution 2

Time Complexity: O(1)
Space Complexity: O(N)

*/


class MinStack {
    Stack<Long> stack;   // Stack to store values (using Long for flexibility)
    Long minValue;       // Variable to track the current minimum value

    public MinStack() {
        stack = new Stack<>();
        minValue = Long.MAX_VALUE;  // Initialize the minimum value to the maximum possible Long value
    }
    
    // Function to push a value onto the stack
    public void push(int val) {
        Long value = Long.valueOf(val);  // Convert the int value to Long for comparison and storage

        // If the stack is empty, set the minimum value and push the value onto the stack
        if (stack.isEmpty()) {
            minValue = value;
            stack.push(value);
        } else {
            // If the new value is smaller than the current minimum, adjust the value before pushing
            if (minValue > value) {
                stack.push(2 * value - minValue);
                minValue = value;
            } else {
                stack.push(value);
            }
        }
    }
    
    // Function to pop the top element from the stack
    public void pop() {
        if (stack.isEmpty()) return;

        Long poppedValue = stack.pop();

        // If the popped value was smaller than the current minimum, adjust the minimum value
        if (minValue > poppedValue) {
            minValue = 2 * minValue - poppedValue;
        }
    }
    
    // Function to get the top element from the stack
    public int top() {
        Long peekValue = stack.peek();

        // If the top value is smaller than the current minimum, return the current minimum
        if (minValue > peekValue) {
            return minValue.intValue();
        }

        // Otherwise, return the top value
        return peekValue.intValue();
    }
    
    // Function to get the minimum element from the stack
    public int getMin() {
        return minValue.intValue();
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
