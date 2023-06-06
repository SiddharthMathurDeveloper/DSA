package Stack.Expressions;

import java.util.Stack;

public class PrefixToInfix {
    public static void main(String[] args) {
        System.out.println(prefixToInfix("*-A/BC-/AKL"));

    }

    public static String prefixToInfix(String prefixExpression){


        int prefixLength = prefixExpression.length();

        Stack<String>mainStack = new Stack<String>();


        for (int i=prefixLength-1; i>=0; i--){
            String character = String.valueOf(prefixExpression.charAt(i));

            if (isOperator(character)){
                 String   operand1 = mainStack.pop();
                 String  operand2 = mainStack.pop();

                String infixExpression = "(" + operand1 + character + operand2 + ")";


                    mainStack.push(infixExpression);
            }
            else {
                mainStack.push(character);
            }
        }

        return mainStack.pop();
    }



    static boolean isOperator (String operator){
        switch (operator){
            case "+","-","*","/":
                return true;
        }
       return false;
    }


}
