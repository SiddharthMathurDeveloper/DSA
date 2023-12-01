class MyQueue {
    Stack<Integer> input;  // Stack for enqueue operations
    Stack<Integer> output; // Stack for dequeue and peek operations
    
    // Constructor to initialize the stacks
    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }
    
    // Function to push an element into the queue
    public void push(int x) {
        input.push(x);
    }
    
    // Function to pop and return the front element from the queue
    public int pop() {
        peek(); // Ensure the output stack is up-to-date
        return output.pop();
    }
    
    // Function to return the front element from the queue without removing it
    public int peek() {
        // If the output stack is empty, transfer elements from the input stack
        if (output.empty()) {
            while (!input.empty()) {
                output.push(input.pop());
            }
        }
        // Return the front element from the output stack
        return output.peek();
    }
    
    // Function to check if the queue is empty
    public boolean empty() {
        return input.empty() && output.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
