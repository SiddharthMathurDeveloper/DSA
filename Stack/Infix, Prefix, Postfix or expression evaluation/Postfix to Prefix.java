public class Leetcode {
    public static String postfixToInfix(String exp){
        Stack<String> mainStack = new Stack<String>();

      

        for (Character character : exp.toCharArray()) {
            if(Character.isLetterOrDigit(character)){
                   mainStack.push(character.toString());
            }
            else{
              String operand2 = mainStack.pop();  // stack way
              String operand1 = mainStack.pop();
              char operator = character;

              mainStack.push( operator+operand1 + operand2);
            }

            
        }
        String infixExpression="";

        while(!mainStack.empty()){
            infixExpression+=mainStack.pop();
        }

        
        return infixExpression;

    }

    public static void main(String[] args) {
        String postfixExpression = "ABC/-AK/L-*";
      System.out.println(  postfixToInfix(postfixExpression));
        
    }
}
