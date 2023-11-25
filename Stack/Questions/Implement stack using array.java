class MyStack {
    // Member variable to represent the top of the stack
    int top;
    // Array to store the stack elements (size 1000 in this case)
    int arr[] = new int[1000];

    // Constructor to initialize the stack
    MyStack() {
        top = -1; // Initialize top to -1 indicating an empty stack
    }

    // Function to push an integer into the stack.
    void push(int a) {
        // Check if the stack is full before pushing
        if (top == arr.length) {
            return; // Stack overflow, cannot push more elements
        }

        top += 1; // Increment top
        arr[top] = a; // Push the new element onto the stack
    }

    // Function to remove an item from the top of the stack.
    int pop() {
        // Check if the stack is empty before popping
        if (top == -1) {
            return -1; // Stack underflow, cannot pop from an empty stack
        }

        int poppedValue = arr[top]; // Get the top element
        arr[top] = 0; // Clear the top element (optional, but good practice)
        top -= 1; // Decrement top to remove the top element from the stack

        return poppedValue; // Return the popped element
    }
}
