

import java.util.Stack;

public class PostfixToInfix {

    public static void main(String[] args) {

        Solution2 solution = new Solution2();

        System.out.println(solution.postToInfix(("2 0 /")));

    }

}

class Solution2 {


    public String postToInfix(String postfixExpression) {

        Stack<String> mainStack = new Stack<String>();

        for (Character character : postfixExpression.toCharArray()) {

            if (character == ' ') {
                continue;
            }

            else if (!mainStack.empty() && isOperator(character)) {
                String secondOperand = mainStack.pop().toString();
                String firstOperand = mainStack.pop().toString();

                String infixExpression = "(" + firstOperand + character.toString() + secondOperand + ")";
                mainStack.push(infixExpression);
            }

            else {
                mainStack.push(character.toString());
            }

        }

        String infixExpressionString = mainStack.pop();

        return infixExpressionString;
    }



    private boolean isOperator(Character operator) {
        switch (operator) {
            case '+', '-', '*', '/':
                return true;
        }
        return false;
    }




    

}
