package DSA.Stack.expressions;

import java.util.Stack;

public class PostfixToPrefix {

    public static void main(String[] args) {

        Solution3 solution = new Solution3();

        System.out.println(solution.postToPrefix(("56+78-")));

    }

}

class Solution3 {


    public String postToPrefix(String postfixExpression) {

        Stack<String> mainStack = new Stack<String>();

        for (Character character : postfixExpression.toCharArray()) {

            if (character == ' ') {
                continue;
            }

            else if (!mainStack.empty() && isOperator(character)) {
                String secondOperand = mainStack.pop().toString();
                String firstOperand = mainStack.pop().toString();
                String operator = character.toString();

                String prefixExpression = operator + firstOperand + secondOperand;
                mainStack.push(prefixExpression);
            }

            else {
                mainStack.push(character.toString());
            }

        }

        String prefixExpressionString = "";

        while (!mainStack.empty()) {
            prefixExpressionString = mainStack.pop() + prefixExpressionString;
        }

        return prefixExpressionString;

    }


    



    private boolean isOperator(Character operator) {
        switch (operator) {
            case '+', '-', '*', '/':
                return true;
        }
        return false;
    }

}
