
/* Solution 1
TC -> O(N)
SC -> O(N)
*/
class Solution {
    public int evalRPN(String[] tokens) {
        // Initialize a stack to store operands
        Stack<Integer> stack = new Stack<>();

        // Iterate through the tokens
        for (String token : tokens) {
            int num1, num2;
            switch (token) {
                case "+":
                    // If the token is "+", pop two operands from the stack, add them, and push the result back to the stack
                    num1 = stack.pop();
                    num2 = stack.pop();
                    stack.push(num1 + num2);
                    break;
                case "-":
                    // If the token is "-", pop two operands from the stack, subtract them, and push the result back to the stack
                    num2 = stack.pop();
                    num1 = stack.pop();
                    stack.push(num1 - num2);
                    break;
                case "*":
                    // If the token is "*", pop two operands from the stack, multiply them, and push the result back to the stack
                    num1 = stack.pop();
                    num2 = stack.pop();
                    stack.push(num1 * num2);
                    break;
                case "/":
                    // If the token is "/", pop two operands from the stack, divide them, and push the result back to the stack
                    num2 = stack.pop();
                    num1 = stack.pop();
                    stack.push(num1 / num2);
                    break;
                default:
                    // If the token is a number, push it to the stack
                    stack.push(Integer.parseInt(token));
            }
        }

        // The final result is the only element left in the stack
        return stack.pop();
    }
}
