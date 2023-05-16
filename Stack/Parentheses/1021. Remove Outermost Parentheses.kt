[Apporoach (Count Method)]
------------------------------------------------------------------------------------------

fun removeOuterParentheses(s: String): String {
        var resultString:String="";
        var countOpenParentheses:Int =0;

        s.forEach {parentheses->
          
            if(parentheses=='('){
                countOpenParentheses++;
                if(countOpenParentheses>1){
                    resultString+=parentheses;
                }
            }

            else if( parentheses==')'){
                countOpenParentheses--;
                if(countOpenParentheses>0){
                    resultString+=parentheses;
                }
            }
        }
   
   return resultString;
}




[Apporoach (Stack Method)]
-----------------------------------------------------------------
        
  
 fun removeOuterParentheses(s: String): String {
     val mainStack: Stack<Char> = Stack<Char>();
     var stringWithoutOuterParentheses: String = "";

        for (character in s) {

            if (mainStack.empty()) {
                mainStack.push(character);
            } 
            else if ((mainStack.size == 1 && character == ')') && !mainStack.empty()) {
                mainStack.pop();
            }     
            else if (character == '(') {
                stringWithoutOuterParentheses += character;
                mainStack.push(character);
            }
            else {
                stringWithoutOuterParentheses += character;
                mainStack.pop();
            }
        }

        return stringWithoutOuterParentheses;
        
    }
        
        
