 
 [Apporoach (Stack Method)]
-----------------------------------------------------------------

import kotlin.math.max

   fun scoreOfParentheses(s: String): Int {
    val mainStack:Stack<Int> = Stack<Int>();
    var parenthesesScore:Int=0;

    s.forEach { character ->
        if(character=='('){
            mainStack.push(parenthesesScore);
            parenthesesScore=0;
        }
        else{
            parenthesesScore = mainStack.peek() + max(parenthesesScore*2,1); // when '(' parenthesesScore is zero and max  0,1  , 1 will the max values but because parenthesesScore=0 when '('
            mainStack.pop()

        }
    }


    return parenthesesScore;
}
