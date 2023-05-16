// Apporoach [Count way]

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
