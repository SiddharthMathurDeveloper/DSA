
/* Solution 1
Using Two Queues
TC -> O(N)
SC -> O(N)
*/
class MyStack {
    // Two queues are used to implement the stack
    Queue<Integer> primary; // Main queue for storing elements
    Queue<Integer> secondary; // Auxiliary queue for temporary storage

    // Constructor to initialize the queues
    public MyStack() {
        primary = new LinkedList<>();
        secondary = new LinkedList<>();
    }

    // Method to push an element onto the stack
    public void push(int x) {
        // Add the new element to the auxiliary queue
        secondary.add(x);

        // Move all elements from the main queue to the auxiliary queue
        while (!primary.isEmpty()) {
            secondary.add(primary.remove());
        }

        // Swap the names of the main and auxiliary queues
        Queue<Integer> temp = primary;
        primary = secondary;
        secondary = temp;
    }

    // Method to pop the element from the stack
    public int pop() {
        // Remove and return the front element from the main queue
        return primary.remove();
    }

    // Method to get the top element of the stack without removing it
    public int top() {
        // If the main queue is empty, return -1 (indicating an empty stack)
        if (primary.isEmpty()) {
            return -1;
        }
        // Return the front element of the main queue
        return primary.peek();
    }

    // Method to check if the stack is empty
    public boolean empty() {
        // Check if the main queue is empty
        return primary.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */



/* Solution 2
Using One Queues
TC -> O(N)
SC -> O(N)
*/


class MyStack {

    Queue<Integer> primary; // Queue used to implement the stack

    // Constructor to initialize the queue
    public MyStack() {
        primary = new LinkedList<>();
    }

    // Method to push an element onto the stack
    public void push(int x) {
        // Add the new element to the end of the queue
        primary.add(x);

        // Rotate the elements in the queue to make the recently added element at the front
        int currentQueueSize = primary.size();
        for (int i = 0; i < currentQueueSize - 1; i++) {
            primary.add(primary.remove());
        }
    }

    // Method to pop the element from the stack
    public int pop() {
        // Remove and return the front element from the queue (simulating pop operation)
        return primary.remove();
    }

    // Method to get the top element of the stack without removing it
    public int top() {
        // If the queue is empty, return -1 (indicating an empty stack)
        if (primary.isEmpty()) {
            return -1;
        }
        // Return the front element of the queue
        return primary.peek();
    }

    // Method to check if the stack is empty
    public boolean empty() {
        // Check if the queue is empty
        return primary.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */










